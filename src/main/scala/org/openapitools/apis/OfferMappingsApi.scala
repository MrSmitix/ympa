package org.openapitools.apis

import java.io._
import ympa_scala_finch_server._
import org.openapitools.models._
import org.openapitools.models.ApiClientDataErrorResponse
import org.openapitools.models.ApiForbiddenErrorResponse
import org.openapitools.models.ApiLimitErrorResponse
import org.openapitools.models.ApiLockedErrorResponse
import org.openapitools.models.ApiNotFoundErrorResponse
import org.openapitools.models.ApiServerErrorResponse
import org.openapitools.models.ApiUnauthorizedErrorResponse
import org.openapitools.models.EmptyApiResponse
import org.openapitools.models.GetOfferMappingEntriesResponse
import org.openapitools.models.GetSuggestedOfferMappingEntriesRequest
import org.openapitools.models.GetSuggestedOfferMappingEntriesResponse
import org.openapitools.models.OfferAvailabilityStatusType
import org.openapitools.models.OfferMappingKindType
import org.openapitools.models.OfferProcessingStatusType
import scala.collection.immutable.Seq
import org.openapitools.models.UpdateOfferMappingEntryRequest
import io.finch.circe._
import io.circe.generic.semiauto._
import com.twitter.concurrent.AsyncStream
import com.twitter.finagle.Service
import com.twitter.finagle.Http
import com.twitter.finagle.http.{Request, Response}
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}
import com.twitter.util.Future
import com.twitter.io.Buf
import io.finch._, items._
import java.io.File
import java.nio.file.Files
import java.time._

object OfferMappingsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        getOfferMappingEntries(da) :+:
        getSuggestedOfferMappingEntries(da) :+:
        updateOfferMappingEntries(da)


    private def checkError(e: CommonError) = e match {
      case InvalidInput(_) => BadRequest(e)
      case MissingIdentifier(_) => BadRequest(e)
      case RecordNotFound(_) => NotFound(e)
      case _ => InternalServerError(e)
    }

    implicit class StringOps(s: String) {

      import java.time.format.DateTimeFormatter

      lazy val localformatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
      lazy val datetimeformatter: DateTimeFormatter =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")

      def toLocalDateTime: LocalDateTime = LocalDateTime.parse(s,localformatter)
      def toZonedDateTime: ZonedDateTime = ZonedDateTime.parse(s, datetimeformatter)

    }

        /**
        * 
        * @return An endpoint representing a GetOfferMappingEntriesResponse
        */
        private def getOfferMappingEntries(da: DataAccessor): Endpoint[GetOfferMappingEntriesResponse] =
        get("campaigns" :: long :: "offer-mapping-entries" :: params("offer_id") :: params("shop_sku") :: paramOption("mapping_kind").map(_.map(_.toOfferMappingKindType)) :: params("status") :: params("availability") :: params("category_id") :: params("vendor") :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt))) { (campaignId: Long, offerId: Seq[String], shopSku: Seq[String], mappingKind: Option[OfferMappingKindType], status: Seq[OfferProcessingStatusType], availability: Seq[OfferAvailabilityStatusType], categoryId: Seq[Int], vendor: Seq[String], pageToken: Option[String], limit: Option[Int]) =>
          da.OfferMappings_getOfferMappingEntries(campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetSuggestedOfferMappingEntriesResponse
        */
        private def getSuggestedOfferMappingEntries(da: DataAccessor): Endpoint[GetSuggestedOfferMappingEntriesResponse] =
        post("campaigns" :: long :: "offer-mapping-entries" :: "suggestions" :: jsonBody[GetSuggestedOfferMappingEntriesRequest]) { (campaignId: Long, getSuggestedOfferMappingEntriesRequest: GetSuggestedOfferMappingEntriesRequest) =>
          da.OfferMappings_getSuggestedOfferMappingEntries(campaignId, getSuggestedOfferMappingEntriesRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EmptyApiResponse
        */
        private def updateOfferMappingEntries(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("campaigns" :: long :: "offer-mapping-entries" :: "updates" :: jsonBody[UpdateOfferMappingEntryRequest]) { (campaignId: Long, updateOfferMappingEntryRequest: UpdateOfferMappingEntryRequest) =>
          da.OfferMappings_updateOfferMappingEntries(campaignId, updateOfferMappingEntryRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }


    implicit private def fileUploadToFile(fileUpload: FileUpload) : File = {
      fileUpload match {
        case upload: InMemoryFileUpload =>
          bytesToFile(Buf.ByteArray.Owned.extract(upload.content))
        case upload: OnDiskFileUpload =>
          upload.content
        case _ => null
      }
    }

    private def bytesToFile(input: Array[Byte]): java.io.File = {
      val file = Files.createTempFile("tmpOfferMappingsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}

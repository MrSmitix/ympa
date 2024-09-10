package org.openapitools.apis

import java.io._
import ympa_scala_finch_server._
import org.openapitools.models._
import org.openapitools.models.AddOffersToArchiveRequest
import org.openapitools.models.AddOffersToArchiveResponse
import org.openapitools.models.ApiClientDataErrorResponse
import org.openapitools.models.ApiForbiddenErrorResponse
import org.openapitools.models.ApiLimitErrorResponse
import org.openapitools.models.ApiLockedErrorResponse
import org.openapitools.models.ApiNotFoundErrorResponse
import org.openapitools.models.ApiServerErrorResponse
import org.openapitools.models.ApiUnauthorizedErrorResponse
import org.openapitools.models.DeleteOffersFromArchiveRequest
import org.openapitools.models.DeleteOffersFromArchiveResponse
import org.openapitools.models.DeleteOffersRequest
import org.openapitools.models.DeleteOffersResponse
import org.openapitools.models.GetOfferMappingsRequest
import org.openapitools.models.GetOfferMappingsResponse
import org.openapitools.models.GetSuggestedOfferMappingsRequest
import org.openapitools.models.GetSuggestedOfferMappingsResponse
import org.openapitools.models.UpdateOfferMappingsRequest
import org.openapitools.models.UpdateOfferMappingsResponse
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

object BusinessOfferMappingsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        addOffersToArchive(da) :+:
        deleteOffers(da) :+:
        deleteOffersFromArchive(da) :+:
        getOfferMappings(da) :+:
        getSuggestedOfferMappings(da) :+:
        updateOfferMappings(da)


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
        * @return An endpoint representing a AddOffersToArchiveResponse
        */
        private def addOffersToArchive(da: DataAccessor): Endpoint[AddOffersToArchiveResponse] =
        post("businesses" :: long :: "offer-mappings" :: "archive" :: jsonBody[AddOffersToArchiveRequest]) { (businessId: Long, addOffersToArchiveRequest: AddOffersToArchiveRequest) =>
          da.BusinessOfferMappings_addOffersToArchive(businessId, addOffersToArchiveRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DeleteOffersResponse
        */
        private def deleteOffers(da: DataAccessor): Endpoint[DeleteOffersResponse] =
        post("businesses" :: long :: "offer-mappings" :: "delete" :: jsonBody[DeleteOffersRequest]) { (businessId: Long, deleteOffersRequest: DeleteOffersRequest) =>
          da.BusinessOfferMappings_deleteOffers(businessId, deleteOffersRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DeleteOffersFromArchiveResponse
        */
        private def deleteOffersFromArchive(da: DataAccessor): Endpoint[DeleteOffersFromArchiveResponse] =
        post("businesses" :: long :: "offer-mappings" :: "unarchive" :: jsonBody[DeleteOffersFromArchiveRequest]) { (businessId: Long, deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest) =>
          da.BusinessOfferMappings_deleteOffersFromArchive(businessId, deleteOffersFromArchiveRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetOfferMappingsResponse
        */
        private def getOfferMappings(da: DataAccessor): Endpoint[GetOfferMappingsResponse] =
        post("businesses" :: long :: "offer-mappings" :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt)) :: jsonBody[GetOfferMappingsRequest]) { (businessId: Long, pageToken: Option[String], limit: Option[Int], getOfferMappingsRequest: GetOfferMappingsRequest) =>
          da.BusinessOfferMappings_getOfferMappings(businessId, pageToken, limit, getOfferMappingsRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetSuggestedOfferMappingsResponse
        */
        private def getSuggestedOfferMappings(da: DataAccessor): Endpoint[GetSuggestedOfferMappingsResponse] =
        post("businesses" :: long :: "offer-mappings" :: "suggestions" :: jsonBody[GetSuggestedOfferMappingsRequest]) { (businessId: Long, getSuggestedOfferMappingsRequest: GetSuggestedOfferMappingsRequest) =>
          da.BusinessOfferMappings_getSuggestedOfferMappings(businessId, getSuggestedOfferMappingsRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UpdateOfferMappingsResponse
        */
        private def updateOfferMappings(da: DataAccessor): Endpoint[UpdateOfferMappingsResponse] =
        post("businesses" :: long :: "offer-mappings" :: "update" :: jsonBody[UpdateOfferMappingsRequest]) { (businessId: Long, updateOfferMappingsRequest: UpdateOfferMappingsRequest) =>
          da.BusinessOfferMappings_updateOfferMappings(businessId, updateOfferMappingsRequest) match {
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
      val file = Files.createTempFile("tmpBusinessOfferMappingsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}

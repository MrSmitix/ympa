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
import org.openapitools.models.ConfirmPricesRequest
import org.openapitools.models.EmptyApiResponse
import org.openapitools.models.GetQuarantineOffersRequest
import org.openapitools.models.GetQuarantineOffersResponse
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

object PriceQuarantineApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        confirmBusinessPrices(da) :+:
        confirmCampaignPrices(da) :+:
        getBusinessQuarantineOffers(da) :+:
        getCampaignQuarantineOffers(da)


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
        * @return An endpoint representing a EmptyApiResponse
        */
        private def confirmBusinessPrices(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("businesses" :: long :: "price-quarantine" :: "confirm" :: jsonBody[ConfirmPricesRequest]) { (businessId: Long, confirmPricesRequest: ConfirmPricesRequest) =>
          da.PriceQuarantine_confirmBusinessPrices(businessId, confirmPricesRequest) match {
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
        private def confirmCampaignPrices(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("campaigns" :: long :: "price-quarantine" :: "confirm" :: jsonBody[ConfirmPricesRequest]) { (campaignId: Long, confirmPricesRequest: ConfirmPricesRequest) =>
          da.PriceQuarantine_confirmCampaignPrices(campaignId, confirmPricesRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetQuarantineOffersResponse
        */
        private def getBusinessQuarantineOffers(da: DataAccessor): Endpoint[GetQuarantineOffersResponse] =
        post("businesses" :: long :: "price-quarantine" :: jsonBody[GetQuarantineOffersRequest] :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt))) { (businessId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String], limit: Option[Int]) =>
          da.PriceQuarantine_getBusinessQuarantineOffers(businessId, getQuarantineOffersRequest, pageToken, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetQuarantineOffersResponse
        */
        private def getCampaignQuarantineOffers(da: DataAccessor): Endpoint[GetQuarantineOffersResponse] =
        post("campaigns" :: long :: "price-quarantine" :: jsonBody[GetQuarantineOffersRequest] :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt))) { (campaignId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String], limit: Option[Int]) =>
          da.PriceQuarantine_getCampaignQuarantineOffers(campaignId, getQuarantineOffersRequest, pageToken, limit) match {
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
      val file = Files.createTempFile("tmpPriceQuarantineApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}

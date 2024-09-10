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
import org.openapitools.models.GetPricesByOfferIdsRequest
import org.openapitools.models.GetPricesByOfferIdsResponse
import org.openapitools.models.GetPricesResponse
import org.openapitools.models.SuggestPricesRequest
import org.openapitools.models.SuggestPricesResponse
import org.openapitools.models.UpdateBusinessPricesRequest
import org.openapitools.models.UpdatePricesRequest
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

object PricesApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        getPrices(da) :+:
        getPricesByOfferIds(da) :+:
        getSuggestedPrices(da) :+:
        updateBusinessPrices(da) :+:
        updatePrices(da)


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
        * @return An endpoint representing a GetPricesResponse
        */
        private def getPrices(da: DataAccessor): Endpoint[GetPricesResponse] =
        get("campaigns" :: long :: "offer-prices" :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("archived").map(_.map(_.toBoolean))) { (campaignId: Long, pageToken: Option[String], limit: Option[Int], archived: Option[Boolean]) =>
          da.Prices_getPrices(campaignId, pageToken, limit, archived) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetPricesByOfferIdsResponse
        */
        private def getPricesByOfferIds(da: DataAccessor): Endpoint[GetPricesByOfferIdsResponse] =
        post("campaigns" :: long :: "offer-prices" :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt)) :: jsonBody[GetPricesByOfferIdsRequest]) { (campaignId: Long, pageToken: Option[String], limit: Option[Int], getPricesByOfferIdsRequest: GetPricesByOfferIdsRequest) =>
          da.Prices_getPricesByOfferIds(campaignId, pageToken, limit, getPricesByOfferIdsRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a SuggestPricesResponse
        */
        private def getSuggestedPrices(da: DataAccessor): Endpoint[SuggestPricesResponse] =
        post("campaigns" :: long :: "offer-prices" :: "suggestions" :: jsonBody[SuggestPricesRequest]) { (campaignId: Long, suggestPricesRequest: SuggestPricesRequest) =>
          da.Prices_getSuggestedPrices(campaignId, suggestPricesRequest) match {
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
        private def updateBusinessPrices(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("businesses" :: long :: "offer-prices" :: "updates" :: jsonBody[UpdateBusinessPricesRequest]) { (businessId: Long, updateBusinessPricesRequest: UpdateBusinessPricesRequest) =>
          da.Prices_updateBusinessPrices(businessId, updateBusinessPricesRequest) match {
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
        private def updatePrices(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("campaigns" :: long :: "offer-prices" :: "updates" :: jsonBody[UpdatePricesRequest]) { (campaignId: Long, updatePricesRequest: UpdatePricesRequest) =>
          da.Prices_updatePrices(campaignId, updatePricesRequest) match {
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
      val file = Files.createTempFile("tmpPricesApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}

package org.openapitools.apis

import java.io._
import ympa_scala_finch_server._
import org.openapitools.models._
import org.openapitools.models.ApiClientDataErrorResponse
import org.openapitools.models.ApiForbiddenErrorResponse
import org.openapitools.models.ApiLimitErrorResponse
import org.openapitools.models.ApiNotFoundErrorResponse
import org.openapitools.models.ApiServerErrorResponse
import org.openapitools.models.ApiUnauthorizedErrorResponse
import org.openapitools.models.EmptyApiResponse
import org.openapitools.models.GetBidsInfoRequest
import org.openapitools.models.GetBidsInfoResponse
import org.openapitools.models.GetBidsRecommendationsRequest
import org.openapitools.models.GetBidsRecommendationsResponse
import org.openapitools.models.PutSkuBidsRequest
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

object BidsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        getBidsInfoForBusiness(da) :+:
        getBidsRecommendations(da) :+:
        putBidsForBusiness(da) :+:
        putBidsForCampaign(da)


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
        * @return An endpoint representing a GetBidsInfoResponse
        */
        private def getBidsInfoForBusiness(da: DataAccessor): Endpoint[GetBidsInfoResponse] =
        post("businesses" :: long :: "bids" :: "info" :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt)) :: jsonBody[GetBidsInfoRequest]) { (businessId: Long, pageToken: Option[String], limit: Option[Int], getBidsInfoRequest: GetBidsInfoRequest) =>
          da.Bids_getBidsInfoForBusiness(businessId, pageToken, limit, getBidsInfoRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetBidsRecommendationsResponse
        */
        private def getBidsRecommendations(da: DataAccessor): Endpoint[GetBidsRecommendationsResponse] =
        post("businesses" :: long :: "bids" :: "recommendations" :: jsonBody[GetBidsRecommendationsRequest]) { (businessId: Long, getBidsRecommendationsRequest: GetBidsRecommendationsRequest) =>
          da.Bids_getBidsRecommendations(businessId, getBidsRecommendationsRequest) match {
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
        private def putBidsForBusiness(da: DataAccessor): Endpoint[EmptyApiResponse] =
        put("businesses" :: long :: "bids" :: jsonBody[PutSkuBidsRequest]) { (businessId: Long, putSkuBidsRequest: PutSkuBidsRequest) =>
          da.Bids_putBidsForBusiness(businessId, putSkuBidsRequest) match {
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
        private def putBidsForCampaign(da: DataAccessor): Endpoint[EmptyApiResponse] =
        put("campaigns" :: long :: "bids" :: jsonBody[PutSkuBidsRequest]) { (campaignId: Long, putSkuBidsRequest: PutSkuBidsRequest) =>
          da.Bids_putBidsForCampaign(campaignId, putSkuBidsRequest) match {
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
      val file = Files.createTempFile("tmpBidsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}

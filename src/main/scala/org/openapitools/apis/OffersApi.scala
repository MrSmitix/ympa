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
import org.openapitools.models.CurrencyType
import org.openapitools.models.DeleteCampaignOffersRequest
import org.openapitools.models.DeleteCampaignOffersResponse
import org.openapitools.models.EmptyApiResponse
import org.openapitools.models.GetAllOffersResponse
import org.openapitools.models.GetCampaignOffersRequest
import org.openapitools.models.GetCampaignOffersResponse
import org.openapitools.models.GetOfferRecommendationsRequest
import org.openapitools.models.GetOfferRecommendationsResponse
import org.openapitools.models.GetOffersResponse
import org.openapitools.models.UpdateCampaignOffersRequest
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

object OffersApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        deleteCampaignOffers(da) :+:
        getAllOffers(da) :+:
        getCampaignOffers(da) :+:
        getOfferRecommendations(da) :+:
        getOffers(da) :+:
        updateCampaignOffers(da)


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
        * @return An endpoint representing a DeleteCampaignOffersResponse
        */
        private def deleteCampaignOffers(da: DataAccessor): Endpoint[DeleteCampaignOffersResponse] =
        post("campaigns" :: long :: "offers" :: "delete" :: jsonBody[DeleteCampaignOffersRequest]) { (campaignId: Long, deleteCampaignOffersRequest: DeleteCampaignOffersRequest) =>
          da.Offers_deleteCampaignOffers(campaignId, deleteCampaignOffersRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetAllOffersResponse
        */
        private def getAllOffers(da: DataAccessor): Endpoint[GetAllOffersResponse] =
        get("campaigns" :: long :: "offers" :: "all" :: paramOption("feedId").map(_.map(_.toLong)) :: paramOption("chunk").map(_.map(_.toInt))) { (campaignId: Long, feedId: Option[Long], chunk: Option[Int]) =>
          da.Offers_getAllOffers(campaignId, feedId, chunk) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetCampaignOffersResponse
        */
        private def getCampaignOffers(da: DataAccessor): Endpoint[GetCampaignOffersResponse] =
        post("campaigns" :: long :: "offers" :: jsonBody[GetCampaignOffersRequest] :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt))) { (campaignId: Long, getCampaignOffersRequest: GetCampaignOffersRequest, pageToken: Option[String], limit: Option[Int]) =>
          da.Offers_getCampaignOffers(campaignId, getCampaignOffersRequest, pageToken, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetOfferRecommendationsResponse
        */
        private def getOfferRecommendations(da: DataAccessor): Endpoint[GetOfferRecommendationsResponse] =
        post("businesses" :: long :: "offers" :: "recommendations" :: jsonBody[GetOfferRecommendationsRequest] :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt))) { (businessId: Long, getOfferRecommendationsRequest: GetOfferRecommendationsRequest, pageToken: Option[String], limit: Option[Int]) =>
          da.Offers_getOfferRecommendations(businessId, getOfferRecommendationsRequest, pageToken, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetOffersResponse
        */
        private def getOffers(da: DataAccessor): Endpoint[GetOffersResponse] =
        get("campaigns" :: long :: "offers" :: paramOption("query") :: paramOption("feedId").map(_.map(_.toLong)) :: paramOption("shopCategoryId") :: paramOption("currency").map(_.map(_.toCurrencyType)) :: paramOption("matched").map(_.map(_.toBoolean)) :: paramOption("page").map(_.map(_.toInt)) :: paramOption("pageSize").map(_.map(_.toInt))) { (campaignId: Long, query: Option[String], feedId: Option[Long], shopCategoryId: Option[String], currency: Option[CurrencyType], matched: Option[Boolean], page: Option[Int], pageSize: Option[Int]) =>
          da.Offers_getOffers(campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize) match {
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
        private def updateCampaignOffers(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("campaigns" :: long :: "offers" :: "update" :: jsonBody[UpdateCampaignOffersRequest]) { (campaignId: Long, updateCampaignOffersRequest: UpdateCampaignOffersRequest) =>
          da.Offers_updateCampaignOffers(campaignId, updateCampaignOffersRequest) match {
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
      val file = Files.createTempFile("tmpOffersApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}

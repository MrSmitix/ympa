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
import org.openapitools.models.GetCampaignLoginsResponse
import org.openapitools.models.GetCampaignRegionResponse
import org.openapitools.models.GetCampaignResponse
import org.openapitools.models.GetCampaignSettingsResponse
import org.openapitools.models.GetCampaignsResponse
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

object CampaignsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        getCampaign(da) :+:
        getCampaignLogins(da) :+:
        getCampaignRegion(da) :+:
        getCampaignSettings(da) :+:
        getCampaigns(da) :+:
        getCampaignsByLogin(da)


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
        * @return An endpoint representing a GetCampaignResponse
        */
        private def getCampaign(da: DataAccessor): Endpoint[GetCampaignResponse] =
        get("campaigns" :: long) { (campaignId: Long) =>
          da.Campaigns_getCampaign(campaignId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetCampaignLoginsResponse
        */
        private def getCampaignLogins(da: DataAccessor): Endpoint[GetCampaignLoginsResponse] =
        get("campaigns" :: long :: "logins") { (campaignId: Long) =>
          da.Campaigns_getCampaignLogins(campaignId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetCampaignRegionResponse
        */
        private def getCampaignRegion(da: DataAccessor): Endpoint[GetCampaignRegionResponse] =
        get("campaigns" :: long :: "region") { (campaignId: Long) =>
          da.Campaigns_getCampaignRegion(campaignId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetCampaignSettingsResponse
        */
        private def getCampaignSettings(da: DataAccessor): Endpoint[GetCampaignSettingsResponse] =
        get("campaigns" :: long :: "settings") { (campaignId: Long) =>
          da.Campaigns_getCampaignSettings(campaignId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetCampaignsResponse
        */
        private def getCampaigns(da: DataAccessor): Endpoint[GetCampaignsResponse] =
        get("campaigns" :: paramOption("page").map(_.map(_.toInt)) :: paramOption("pageSize").map(_.map(_.toInt))) { (page: Option[Int], pageSize: Option[Int]) =>
          da.Campaigns_getCampaigns(page, pageSize) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetCampaignsResponse
        */
        private def getCampaignsByLogin(da: DataAccessor): Endpoint[GetCampaignsResponse] =
        get("campaigns" :: "by_login" :: string :: paramOption("page").map(_.map(_.toInt)) :: paramOption("pageSize").map(_.map(_.toInt))) { (login: String, page: Option[Int], pageSize: Option[Int]) =>
          da.Campaigns_getCampaignsByLogin(login, page, pageSize) match {
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
      val file = Files.createTempFile("tmpCampaignsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}

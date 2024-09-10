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
import org.openapitools.models.ChangeOutletRequest
import org.openapitools.models.CreateOutletResponse
import org.openapitools.models.EmptyApiResponse
import org.openapitools.models.GetOutletResponse
import org.openapitools.models.GetOutletsResponse
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

object OutletsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        createOutlet(da) :+:
        deleteOutlet(da) :+:
        getOutlet(da) :+:
        getOutlets(da) :+:
        updateOutlet(da)


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
        * @return An endpoint representing a CreateOutletResponse
        */
        private def createOutlet(da: DataAccessor): Endpoint[CreateOutletResponse] =
        post("campaigns" :: long :: "outlets" :: jsonBody[ChangeOutletRequest]) { (campaignId: Long, changeOutletRequest: ChangeOutletRequest) =>
          da.Outlets_createOutlet(campaignId, changeOutletRequest) match {
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
        private def deleteOutlet(da: DataAccessor): Endpoint[EmptyApiResponse] =
        delete("campaigns" :: long :: "outlets" :: long) { (campaignId: Long, outletId: Long) =>
          da.Outlets_deleteOutlet(campaignId, outletId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetOutletResponse
        */
        private def getOutlet(da: DataAccessor): Endpoint[GetOutletResponse] =
        get("campaigns" :: long :: "outlets" :: long) { (campaignId: Long, outletId: Long) =>
          da.Outlets_getOutlet(campaignId, outletId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetOutletsResponse
        */
        private def getOutlets(da: DataAccessor): Endpoint[GetOutletsResponse] =
        get("campaigns" :: long :: "outlets" :: paramOption("page_token") :: paramOption("region_id").map(_.map(_.toLong)) :: paramOption("shop_outlet_code") :: paramOption("regionId").map(_.map(_.toLong))) { (campaignId: Long, pageToken: Option[String], regionId: Option[Long], shopOutletCode: Option[String], regionId2: Option[Long]) =>
          da.Outlets_getOutlets(campaignId, pageToken, regionId, shopOutletCode, regionId2) match {
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
        private def updateOutlet(da: DataAccessor): Endpoint[EmptyApiResponse] =
        put("campaigns" :: long :: "outlets" :: long :: jsonBody[ChangeOutletRequest]) { (campaignId: Long, outletId: Long, changeOutletRequest: ChangeOutletRequest) =>
          da.Outlets_updateOutlet(campaignId, outletId, changeOutletRequest) match {
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
      val file = Files.createTempFile("tmpOutletsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}

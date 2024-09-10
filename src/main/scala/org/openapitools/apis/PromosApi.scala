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
import org.openapitools.models.DeletePromoOffersRequest
import org.openapitools.models.DeletePromoOffersResponse
import org.openapitools.models.GetPromoOffersRequest
import org.openapitools.models.GetPromoOffersResponse
import org.openapitools.models.GetPromosRequest
import org.openapitools.models.GetPromosResponse
import org.openapitools.models.UpdatePromoOffersRequest
import org.openapitools.models.UpdatePromoOffersResponse
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

object PromosApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        deletePromoOffers(da) :+:
        getPromoOffers(da) :+:
        getPromos(da) :+:
        updatePromoOffers(da)


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
        * @return An endpoint representing a DeletePromoOffersResponse
        */
        private def deletePromoOffers(da: DataAccessor): Endpoint[DeletePromoOffersResponse] =
        post("businesses" :: long :: "promos" :: "offers" :: "delete" :: jsonBody[DeletePromoOffersRequest]) { (businessId: Long, deletePromoOffersRequest: DeletePromoOffersRequest) =>
          da.Promos_deletePromoOffers(businessId, deletePromoOffersRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetPromoOffersResponse
        */
        private def getPromoOffers(da: DataAccessor): Endpoint[GetPromoOffersResponse] =
        post("businesses" :: long :: "promos" :: "offers" :: jsonBody[GetPromoOffersRequest] :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt))) { (businessId: Long, getPromoOffersRequest: GetPromoOffersRequest, pageToken: Option[String], limit: Option[Int]) =>
          da.Promos_getPromoOffers(businessId, getPromoOffersRequest, pageToken, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetPromosResponse
        */
        private def getPromos(da: DataAccessor): Endpoint[GetPromosResponse] =
        post("businesses" :: long :: "promos" :: jsonBody[GetPromosRequest]) { (businessId: Long, getPromosRequest: GetPromosRequest) =>
          da.Promos_getPromos(businessId, getPromosRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UpdatePromoOffersResponse
        */
        private def updatePromoOffers(da: DataAccessor): Endpoint[UpdatePromoOffersResponse] =
        post("businesses" :: long :: "promos" :: "offers" :: "update" :: jsonBody[UpdatePromoOffersRequest]) { (businessId: Long, updatePromoOffersRequest: UpdatePromoOffersRequest) =>
          da.Promos_updatePromoOffers(businessId, updatePromoOffersRequest) match {
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
      val file = Files.createTempFile("tmpPromosApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}

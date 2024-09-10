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
import java.io.File
import org.openapitools.models.GetReturnResponse
import org.openapitools.models.GetReturnsResponse
import java.time.LocalDateTime
import org.openapitools.models.RefundStatusType
import org.openapitools.models.ReturnType
import scala.collection.immutable.Seq
import org.openapitools.models.SetReturnDecisionRequest
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

object ReturnsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        getReturn(da) :+:
        getReturnApplication(da) :+:
        getReturnPhoto(da) :+:
        getReturns(da) :+:
        setReturnDecision(da) :+:
        submitReturnDecision(da)


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
        * @return An endpoint representing a GetReturnResponse
        */
        private def getReturn(da: DataAccessor): Endpoint[GetReturnResponse] =
        get("campaigns" :: long :: "orders" :: long :: "returns" :: long) { (campaignId: Long, orderId: Long, returnId: Long) =>
          da.Returns_getReturn(campaignId, orderId, returnId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a File
        */
        private def getReturnApplication(da: DataAccessor): Endpoint[File] =
        get("campaigns" :: long :: "orders" :: long :: "returns" :: long :: "application") { (campaignId: Long, orderId: Long, returnId: Long) =>
          da.Returns_getReturnApplication(campaignId, orderId, returnId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a File
        */
        private def getReturnPhoto(da: DataAccessor): Endpoint[File] =
        get("campaigns" :: long :: "orders" :: long :: "returns" :: long :: "decision" :: long :: "image" :: string) { (campaignId: Long, orderId: Long, returnId: Long, itemId: Long, imageHash: String) =>
          da.Returns_getReturnPhoto(campaignId, orderId, returnId, itemId, imageHash) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetReturnsResponse
        */
        private def getReturns(da: DataAccessor): Endpoint[GetReturnsResponse] =
        get("campaigns" :: long :: "returns" :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt)) :: params("orderIds") :: params("statuses") :: paramOption("type").map(_.map(_.toReturnType)) :: paramOption("fromDate").map(_.map(_.toLocalDateTime)) :: paramOption("toDate").map(_.map(_.toLocalDateTime)) :: paramOption("from_date").map(_.map(_.toLocalDateTime)) :: paramOption("to_date").map(_.map(_.toLocalDateTime))) { (campaignId: Long, pageToken: Option[String], limit: Option[Int], orderIds: Seq[Long], statuses: Seq[RefundStatusType], _type: Option[ReturnType], fromDate: Option[LocalDateTime], toDate: Option[LocalDateTime], fromDate2: Option[LocalDateTime], toDate2: Option[LocalDateTime]) =>
          da.Returns_getReturns(campaignId, pageToken, limit, orderIds, statuses, _type, fromDate, toDate, fromDate2, toDate2) match {
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
        private def setReturnDecision(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("campaigns" :: long :: "orders" :: long :: "returns" :: long :: "decision" :: jsonBody[SetReturnDecisionRequest]) { (campaignId: Long, orderId: Long, returnId: Long, setReturnDecisionRequest: SetReturnDecisionRequest) =>
          da.Returns_setReturnDecision(campaignId, orderId, returnId, setReturnDecisionRequest) match {
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
        private def submitReturnDecision(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("campaigns" :: long :: "orders" :: long :: "returns" :: long :: "decision" :: "submit") { (campaignId: Long, orderId: Long, returnId: Long) =>
          da.Returns_submitReturnDecision(campaignId, orderId, returnId) match {
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
      val file = Files.createTempFile("tmpReturnsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}

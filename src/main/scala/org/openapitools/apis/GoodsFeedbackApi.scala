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
import org.openapitools.models.DeleteGoodsFeedbackCommentRequest
import org.openapitools.models.EmptyApiResponse
import org.openapitools.models.GetGoodsFeedbackCommentsRequest
import org.openapitools.models.GetGoodsFeedbackCommentsResponse
import org.openapitools.models.GetGoodsFeedbackRequest
import org.openapitools.models.GetGoodsFeedbackResponse
import org.openapitools.models.SkipGoodsFeedbackReactionRequest
import org.openapitools.models.UpdateGoodsFeedbackCommentRequest
import org.openapitools.models.UpdateGoodsFeedbackCommentResponse
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

object GoodsFeedbackApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        deleteGoodsFeedbackComment(da) :+:
        getGoodsFeedbackComments(da) :+:
        getGoodsFeedbacks(da) :+:
        skipGoodsFeedbacksReaction(da) :+:
        updateGoodsFeedbackComment(da)


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
        private def deleteGoodsFeedbackComment(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("businesses" :: long :: "goods-feedback" :: "comments" :: "delete" :: jsonBody[DeleteGoodsFeedbackCommentRequest]) { (businessId: Long, deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest) =>
          da.GoodsFeedback_deleteGoodsFeedbackComment(businessId, deleteGoodsFeedbackCommentRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetGoodsFeedbackCommentsResponse
        */
        private def getGoodsFeedbackComments(da: DataAccessor): Endpoint[GetGoodsFeedbackCommentsResponse] =
        post("businesses" :: long :: "goods-feedback" :: "comments" :: jsonBody[GetGoodsFeedbackCommentsRequest] :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt))) { (businessId: Long, getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest, pageToken: Option[String], limit: Option[Int]) =>
          da.GoodsFeedback_getGoodsFeedbackComments(businessId, getGoodsFeedbackCommentsRequest, pageToken, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetGoodsFeedbackResponse
        */
        private def getGoodsFeedbacks(da: DataAccessor): Endpoint[GetGoodsFeedbackResponse] =
        post("businesses" :: long :: "goods-feedback" :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt)) :: jsonBody[GetGoodsFeedbackRequest]) { (businessId: Long, pageToken: Option[String], limit: Option[Int], getGoodsFeedbackRequest: GetGoodsFeedbackRequest) =>
          da.GoodsFeedback_getGoodsFeedbacks(businessId, pageToken, limit, getGoodsFeedbackRequest) match {
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
        private def skipGoodsFeedbacksReaction(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("businesses" :: long :: "goods-feedback" :: "skip-reaction" :: jsonBody[SkipGoodsFeedbackReactionRequest]) { (businessId: Long, skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest) =>
          da.GoodsFeedback_skipGoodsFeedbacksReaction(businessId, skipGoodsFeedbackReactionRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UpdateGoodsFeedbackCommentResponse
        */
        private def updateGoodsFeedbackComment(da: DataAccessor): Endpoint[UpdateGoodsFeedbackCommentResponse] =
        post("businesses" :: long :: "goods-feedback" :: "comments" :: "update" :: jsonBody[UpdateGoodsFeedbackCommentRequest]) { (businessId: Long, updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest) =>
          da.GoodsFeedback_updateGoodsFeedbackComment(businessId, updateGoodsFeedbackCommentRequest) match {
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
      val file = Files.createTempFile("tmpGoodsFeedbackApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}

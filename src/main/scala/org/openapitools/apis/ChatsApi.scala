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
import org.openapitools.models.CreateChatRequest
import org.openapitools.models.CreateChatResponse
import org.openapitools.models.EmptyApiResponse
import java.io.File
import org.openapitools.models.GetChatHistoryRequest
import org.openapitools.models.GetChatHistoryResponse
import org.openapitools.models.GetChatsRequest
import org.openapitools.models.GetChatsResponse
import org.openapitools.models.SendMessageToChatRequest
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

object ChatsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        createChat(da) :+:
        getChatHistory(da) :+:
        getChats(da) :+:
        sendFileToChat(da) :+:
        sendMessageToChat(da)


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
        * @return An endpoint representing a CreateChatResponse
        */
        private def createChat(da: DataAccessor): Endpoint[CreateChatResponse] =
        post("businesses" :: long :: "chats" :: "new" :: jsonBody[CreateChatRequest]) { (businessId: Long, createChatRequest: CreateChatRequest) =>
          da.Chats_createChat(businessId, createChatRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetChatHistoryResponse
        */
        private def getChatHistory(da: DataAccessor): Endpoint[GetChatHistoryResponse] =
        post("businesses" :: long :: "chats" :: "history" :: param("chatId").map(_.toLong) :: jsonBody[GetChatHistoryRequest] :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt))) { (businessId: Long, chatId: Long, getChatHistoryRequest: GetChatHistoryRequest, pageToken: Option[String], limit: Option[Int]) =>
          da.Chats_getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetChatsResponse
        */
        private def getChats(da: DataAccessor): Endpoint[GetChatsResponse] =
        post("businesses" :: long :: "chats" :: jsonBody[GetChatsRequest] :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt))) { (businessId: Long, getChatsRequest: GetChatsRequest, pageToken: Option[String], limit: Option[Int]) =>
          da.Chats_getChats(businessId, getChatsRequest, pageToken, limit) match {
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
        private def sendFileToChat(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("businesses" :: long :: "chats" :: "file" :: "send" :: param("chatId").map(_.toLong) :: fileUpload("file")) { (businessId: Long, chatId: Long, file: FileUpload) =>
          da.Chats_sendFileToChat(businessId, chatId, file) match {
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
        private def sendMessageToChat(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("businesses" :: long :: "chats" :: "message" :: param("chatId").map(_.toLong) :: jsonBody[SendMessageToChatRequest]) { (businessId: Long, chatId: Long, sendMessageToChatRequest: SendMessageToChatRequest) =>
          da.Chats_sendMessageToChat(businessId, chatId, sendMessageToChatRequest) match {
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
      val file = Files.createTempFile("tmpChatsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}

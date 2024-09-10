package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.StringDirectives
import org.openapitools.server.MultipartDirectives
import org.openapitools.server.FileField
import org.openapitools.server.PartsAndFiles
import org.openapitools.server.model.ApiClientDataErrorResponse
import org.openapitools.server.model.ApiForbiddenErrorResponse
import org.openapitools.server.model.ApiLimitErrorResponse
import org.openapitools.server.model.ApiNotFoundErrorResponse
import org.openapitools.server.model.ApiServerErrorResponse
import org.openapitools.server.model.ApiUnauthorizedErrorResponse
import org.openapitools.server.model.CreateChatRequest
import org.openapitools.server.model.CreateChatResponse
import org.openapitools.server.model.EmptyApiResponse
import java.io.File
import org.openapitools.server.model.GetChatHistoryRequest
import org.openapitools.server.model.GetChatHistoryResponse
import org.openapitools.server.model.GetChatsRequest
import org.openapitools.server.model.GetChatsResponse
import org.openapitools.server.model.SendMessageToChatRequest
import scala.util.Try
import akka.http.scaladsl.server.MalformedRequestContentRejection
import akka.http.scaladsl.server.directives.FileInfo


class ChatsApi(
    chatsService: ChatsApiService,
    chatsMarshaller: ChatsApiMarshaller
)  extends MultipartDirectives with StringDirectives {

  
  import chatsMarshaller._

  lazy val route: Route =
    path("businesses" / LongNumber / "chats" / "new") { (businessId) => 
      post {  
            entity(as[CreateChatRequest]){ createChatRequest =>
              chatsService.createChat(businessId = businessId, createChatRequest = createChatRequest)
            }
      }
    } ~
    path("businesses" / LongNumber / "chats" / "history") { (businessId) => 
      post { 
        parameters("chatId".as[Long], "page_token".as[String].?, "limit".as[Int].?) { (chatId, pageToken, limit) => 
            entity(as[GetChatHistoryRequest]){ getChatHistoryRequest =>
              chatsService.getChatHistory(businessId = businessId, chatId = chatId, getChatHistoryRequest = getChatHistoryRequest, pageToken = pageToken, limit = limit)
            }
        }
      }
    } ~
    path("businesses" / LongNumber / "chats") { (businessId) => 
      post { 
        parameters("page_token".as[String].?, "limit".as[Int].?) { (pageToken, limit) => 
            entity(as[GetChatsRequest]){ getChatsRequest =>
              chatsService.getChats(businessId = businessId, getChatsRequest = getChatsRequest, pageToken = pageToken, limit = limit)
            }
        }
      }
    } ~
    path("businesses" / LongNumber / "chats" / "file" / "send") { (businessId) => 
      post { 
        parameters("chatId".as[Long]) { (chatId) => 
        formAndFiles(FileField("file")),  { partsAndFiles => 
          val _____ : Try[Route] = for {
            file <- optToTry(partsAndFiles.files.get("file"), s"File file missing")
          } yield { 
            implicit val vp: StringValueProvider = partsAndFiles.form
              chatsService.sendFileToChat(businessId = businessId, chatId = chatId, file = file)
            }
          }
          _____.fold[Route](t => reject(MalformedRequestContentRejection("Missing file.", t)), identity)
        }
        }
      }
    } ~
    path("businesses" / LongNumber / "chats" / "message") { (businessId) => 
      post { 
        parameters("chatId".as[Long]) { (chatId) => 
            entity(as[SendMessageToChatRequest]){ sendMessageToChatRequest =>
              chatsService.sendMessageToChat(businessId = businessId, chatId = chatId, sendMessageToChatRequest = sendMessageToChatRequest)
            }
        }
      }
    }
}


trait ChatsApiService {

  def createChat200(responseCreateChatResponse: CreateChatResponse)(implicit toEntityMarshallerCreateChatResponse: ToEntityMarshaller[CreateChatResponse]): Route =
    complete((200, responseCreateChatResponse))
  def createChat400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def createChat401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def createChat403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def createChat404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def createChat420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def createChat500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Все получилось: чат создан. , DataType: CreateChatResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def createChat(businessId: Long, createChatRequest: CreateChatRequest)
      (implicit toEntityMarshallerCreateChatResponse: ToEntityMarshaller[CreateChatResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getChatHistory200(responseGetChatHistoryResponse: GetChatHistoryResponse)(implicit toEntityMarshallerGetChatHistoryResponse: ToEntityMarshaller[GetChatHistoryResponse]): Route =
    complete((200, responseGetChatHistoryResponse))
  def getChatHistory400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getChatHistory401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getChatHistory403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getChatHistory404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getChatHistory420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getChatHistory500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: История сообщений успешно получена. , DataType: GetChatHistoryResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getChatHistory(businessId: Long, chatId: Long, getChatHistoryRequest: GetChatHistoryRequest, pageToken: Option[String], limit: Option[Int])
      (implicit toEntityMarshallerGetChatHistoryResponse: ToEntityMarshaller[GetChatHistoryResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getChats200(responseGetChatsResponse: GetChatsResponse)(implicit toEntityMarshallerGetChatsResponse: ToEntityMarshaller[GetChatsResponse]): Route =
    complete((200, responseGetChatsResponse))
  def getChats400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getChats401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getChats403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getChats404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getChats420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getChats500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Список чатов. , DataType: GetChatsResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getChats(businessId: Long, getChatsRequest: GetChatsRequest, pageToken: Option[String], limit: Option[Int])
      (implicit toEntityMarshallerGetChatsResponse: ToEntityMarshaller[GetChatsResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def sendFileToChat200(responseEmptyApiResponse: EmptyApiResponse)(implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]): Route =
    complete((200, responseEmptyApiResponse))
  def sendFileToChat400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def sendFileToChat401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def sendFileToChat403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def sendFileToChat404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def sendFileToChat420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def sendFileToChat500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Пустой ответ. Означает, что файл отправлен., DataType: EmptyApiResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def sendFileToChat(businessId: Long, chatId: Long, file: (FileInfo, File))
      (implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def sendMessageToChat200(responseEmptyApiResponse: EmptyApiResponse)(implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]): Route =
    complete((200, responseEmptyApiResponse))
  def sendMessageToChat400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def sendMessageToChat401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def sendMessageToChat403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def sendMessageToChat404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def sendMessageToChat420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def sendMessageToChat500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Пустой ответ. Означает, что сообщение отправлено., DataType: EmptyApiResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def sendMessageToChat(businessId: Long, chatId: Long, sendMessageToChatRequest: SendMessageToChatRequest)
      (implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

}

trait ChatsApiMarshaller {
  implicit def fromEntityUnmarshallerSendMessageToChatRequest: FromEntityUnmarshaller[SendMessageToChatRequest]

  implicit def fromEntityUnmarshallerCreateChatRequest: FromEntityUnmarshaller[CreateChatRequest]

  implicit def fromEntityUnmarshallerGetChatsRequest: FromEntityUnmarshaller[GetChatsRequest]

  implicit def fromEntityUnmarshallerGetChatHistoryRequest: FromEntityUnmarshaller[GetChatHistoryRequest]



  implicit def toEntityMarshallerGetChatsResponse: ToEntityMarshaller[GetChatsResponse]

  implicit def toEntityMarshallerGetChatHistoryResponse: ToEntityMarshaller[GetChatHistoryResponse]

  implicit def toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]

  implicit def toEntityMarshallerCreateChatResponse: ToEntityMarshaller[CreateChatResponse]

  implicit def toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]

  implicit def toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]

  implicit def toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]

  implicit def toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]

  implicit def toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]

  implicit def toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]

}


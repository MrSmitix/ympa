package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.CreateChatRequest
import model.CreateChatResponse
import model.EmptyApiResponse
import model.GetChatHistoryRequest
import model.GetChatHistoryResponse
import model.GetChatsRequest
import model.GetChatsResponse
import model.SendMessageToChatRequest
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class ChatsApiController @Inject()(cc: ControllerComponents, api: ChatsApi) extends AbstractController(cc) {
  /**
    * POST /businesses/:businessId/chats/new
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def createChat(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): CreateChatResponse = {
      val createChatRequest = request.body.asJson.map(_.as[CreateChatRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createChatRequest")
      }
      api.createChat(businessId, createChatRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/chats/history?chatId=[value]&pageToken=[value]&limit=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getChatHistory(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetChatHistoryResponse = {
      val getChatHistoryRequest = request.body.asJson.map(_.as[GetChatHistoryRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getChatHistoryRequest")
      }
      val chatId = request.getQueryString("chatId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("chatId", "query string")
        }
        
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/chats?pageToken=[value]&limit=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getChats(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetChatsResponse = {
      val getChatsRequest = request.body.asJson.map(_.as[GetChatsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getChatsRequest")
      }
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getChats(businessId, getChatsRequest, pageToken, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/chats/file/send?chatId=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def sendFileToChat(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val chatId = request.getQueryString("chatId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("chatId", "query string")
        }
        
      val file = request.body.asMultipartFormData.flatMap(_.file("file").map(_.ref: TemporaryFile))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("file", "form")
        }
        
      api.sendFileToChat(businessId, chatId, file)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/chats/message?chatId=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def sendMessageToChat(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val sendMessageToChatRequest = request.body.asJson.map(_.as[SendMessageToChatRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "sendMessageToChatRequest")
      }
      val chatId = request.getQueryString("chatId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("chatId", "query string")
        }
        
      api.sendMessageToChat(businessId, chatId, sendMessageToChatRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}

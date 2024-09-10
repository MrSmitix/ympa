package api

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

/**
  * Provides a default implementation for [[ChatsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class ChatsApiImpl extends ChatsApi {
  /**
    * @inheritdoc
    */
  override def createChat(businessId: Long, createChatRequest: CreateChatRequest): CreateChatResponse = {
    // TODO: Implement better logic

    CreateChatResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getChatHistory(businessId: Long, chatId: Long, getChatHistoryRequest: GetChatHistoryRequest, pageToken: Option[String], limit: Option[Int]): GetChatHistoryResponse = {
    // TODO: Implement better logic

    GetChatHistoryResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getChats(businessId: Long, getChatsRequest: GetChatsRequest, pageToken: Option[String], limit: Option[Int]): GetChatsResponse = {
    // TODO: Implement better logic

    GetChatsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def sendFileToChat(businessId: Long, chatId: Long, file: TemporaryFile): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def sendMessageToChat(businessId: Long, chatId: Long, sendMessageToChatRequest: SendMessageToChatRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }
}

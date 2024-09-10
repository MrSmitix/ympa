/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.api

import org.openapitools.client.model.ApiClientDataErrorResponse
import org.openapitools.client.model.ApiForbiddenErrorResponse
import org.openapitools.client.model.ApiLimitErrorResponse
import org.openapitools.client.model.ApiNotFoundErrorResponse
import org.openapitools.client.model.ApiServerErrorResponse
import org.openapitools.client.model.ApiUnauthorizedErrorResponse
import org.openapitools.client.model.CreateChatRequest
import org.openapitools.client.model.CreateChatResponse
import org.openapitools.client.model.EmptyApiResponse
import java.io.File
import org.openapitools.client.model.GetChatHistoryRequest
import org.openapitools.client.model.GetChatHistoryResponse
import org.openapitools.client.model.GetChatsRequest
import org.openapitools.client.model.GetChatsResponse
import org.openapitools.client.model.SendMessageToChatRequest
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object ChatsApi {

  def apply(baseUrl: String = "https://api.partner.market.yandex.ru") = new ChatsApi(baseUrl)
}

class ChatsApi(baseUrl: String) {

  /**
   * Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
   * 
   * Expected answers:
   *   code 200 : CreateChatResponse (Все получилось: чат создан. )
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param createChatRequest description
   */
  def createChat(businessId: Long, createChatRequest: CreateChatRequest): ApiRequest[CreateChatResponse] =
    ApiRequest[CreateChatResponse](ApiMethods.POST, baseUrl, "/businesses/{businessId}/chats/new", "application/json")
      .withBody(createChatRequest)
      .withPathParam("businessId", businessId)
      .withSuccessResponse[CreateChatResponse](200)
      .withErrorResponse[ApiClientDataErrorResponse](400)
      .withErrorResponse[ApiUnauthorizedErrorResponse](401)
      .withErrorResponse[ApiForbiddenErrorResponse](403)
      .withErrorResponse[ApiNotFoundErrorResponse](404)
      .withErrorResponse[ApiLimitErrorResponse](420)
      .withErrorResponse[ApiServerErrorResponse](500)
      

  /**
   * Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
   * 
   * Expected answers:
   *   code 200 : GetChatHistoryResponse (История сообщений успешно получена. )
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param chatId Идентификатор чата.
   * @param getChatHistoryRequest description
   * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
   * @param limit Количество значений на одной странице. 
   */
  def getChatHistory(businessId: Long, chatId: Long, getChatHistoryRequest: GetChatHistoryRequest, pageToken: Option[String] = None, limit: Option[Int] = None): ApiRequest[GetChatHistoryResponse] =
    ApiRequest[GetChatHistoryResponse](ApiMethods.POST, baseUrl, "/businesses/{businessId}/chats/history", "application/json")
      .withBody(getChatHistoryRequest)
      .withQueryParam("chatId", chatId)
      .withQueryParam("page_token", pageToken)
      .withQueryParam("limit", limit)
      .withPathParam("businessId", businessId)
      .withSuccessResponse[GetChatHistoryResponse](200)
      .withErrorResponse[ApiClientDataErrorResponse](400)
      .withErrorResponse[ApiUnauthorizedErrorResponse](401)
      .withErrorResponse[ApiForbiddenErrorResponse](403)
      .withErrorResponse[ApiNotFoundErrorResponse](404)
      .withErrorResponse[ApiLimitErrorResponse](420)
      .withErrorResponse[ApiServerErrorResponse](500)
      

  /**
   * Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
   * 
   * Expected answers:
   *   code 200 : GetChatsResponse (Список чатов. )
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param getChatsRequest description
   * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
   * @param limit Количество значений на одной странице. 
   */
  def getChats(businessId: Long, getChatsRequest: GetChatsRequest, pageToken: Option[String] = None, limit: Option[Int] = None): ApiRequest[GetChatsResponse] =
    ApiRequest[GetChatsResponse](ApiMethods.POST, baseUrl, "/businesses/{businessId}/chats", "application/json")
      .withBody(getChatsRequest)
      .withQueryParam("page_token", pageToken)
      .withQueryParam("limit", limit)
      .withPathParam("businessId", businessId)
      .withSuccessResponse[GetChatsResponse](200)
      .withErrorResponse[ApiClientDataErrorResponse](400)
      .withErrorResponse[ApiUnauthorizedErrorResponse](401)
      .withErrorResponse[ApiForbiddenErrorResponse](403)
      .withErrorResponse[ApiNotFoundErrorResponse](404)
      .withErrorResponse[ApiLimitErrorResponse](420)
      .withErrorResponse[ApiServerErrorResponse](500)
      

  /**
   * Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
   * 
   * Expected answers:
   *   code 200 : EmptyApiResponse (Пустой ответ. Означает, что файл отправлен.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param chatId Идентификатор чата.
   * @param file Содержимое файла. Максимальный размер файла — 5 Мбайт.
   */
  def sendFileToChat(businessId: Long, chatId: Long, file: File): ApiRequest[EmptyApiResponse] =
    ApiRequest[EmptyApiResponse](ApiMethods.POST, baseUrl, "/businesses/{businessId}/chats/file/send", "multipart/form-data")
      .withFormParam("file", file)
      .withQueryParam("chatId", chatId)
      .withPathParam("businessId", businessId)
      .withSuccessResponse[EmptyApiResponse](200)
      .withErrorResponse[ApiClientDataErrorResponse](400)
      .withErrorResponse[ApiUnauthorizedErrorResponse](401)
      .withErrorResponse[ApiForbiddenErrorResponse](403)
      .withErrorResponse[ApiNotFoundErrorResponse](404)
      .withErrorResponse[ApiLimitErrorResponse](420)
      .withErrorResponse[ApiServerErrorResponse](500)
      

  /**
   * Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
   * 
   * Expected answers:
   *   code 200 : EmptyApiResponse (Пустой ответ. Означает, что сообщение отправлено.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param chatId Идентификатор чата.
   * @param sendMessageToChatRequest description
   */
  def sendMessageToChat(businessId: Long, chatId: Long, sendMessageToChatRequest: SendMessageToChatRequest): ApiRequest[EmptyApiResponse] =
    ApiRequest[EmptyApiResponse](ApiMethods.POST, baseUrl, "/businesses/{businessId}/chats/message", "application/json")
      .withBody(sendMessageToChatRequest)
      .withQueryParam("chatId", chatId)
      .withPathParam("businessId", businessId)
      .withSuccessResponse[EmptyApiResponse](200)
      .withErrorResponse[ApiClientDataErrorResponse](400)
      .withErrorResponse[ApiUnauthorizedErrorResponse](401)
      .withErrorResponse[ApiForbiddenErrorResponse](403)
      .withErrorResponse[ApiNotFoundErrorResponse](404)
      .withErrorResponse[ApiLimitErrorResponse](420)
      .withErrorResponse[ApiServerErrorResponse](500)
      



}


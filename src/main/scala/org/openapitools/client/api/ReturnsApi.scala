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
import org.openapitools.client.model.EmptyApiResponse
import java.io.File
import org.openapitools.client.model.GetReturnResponse
import org.openapitools.client.model.GetReturnsResponse
import java.time.LocalDate
import org.openapitools.client.model.RefundStatusType._
import org.openapitools.client.model.ReturnType._
import org.openapitools.client.model.SetReturnDecisionRequest
import org.openapitools.client.core.JsonSupport._
import sttp.client4._
import sttp.model.Method

object ReturnsApi {
  def apply(baseUrl: String = "https://api.partner.market.yandex.ru") = new ReturnsApi(baseUrl)
}

class ReturnsApi(baseUrl: String) {

  /**
   * Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
   * 
   * Expected answers:
   *   code 200 : GetReturnResponse (Детали возврата.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param orderId Идентификатор заказа.
   * @param returnId Идентификатор возврата.
   */
  def getReturn(campaignId: Long, orderId: Long, returnId: Long): Request[Either[ResponseException[String, Exception], GetReturnResponse]] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/campaigns/${campaignId}/orders/${orderId}/returns/${returnId}")
      .contentType("application/json")
      .response(asJson[GetReturnResponse])

  /**
   * Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
   * 
   * Expected answers:
   *   code 200 : File (Заявление на возврат.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param orderId Идентификатор заказа.
   * @param returnId Идентификатор возврата.
   */
  def getReturnApplication(campaignId: Long, orderId: Long, returnId: Long): Request[Either[ResponseException[String, Exception], File]] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/campaigns/${campaignId}/orders/${orderId}/returns/${returnId}/application")
      .contentType("application/json")
      .response(asJson[File])

  /**
   * Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
   * 
   * Expected answers:
   *   code 200 : File (Фотография возврата.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param orderId Идентификатор заказа.
   * @param returnId Идентификатор возврата.
   * @param itemId Идентификатор товара в возврате.
   * @param imageHash Хеш ссылки изображения для загрузки.
   */
  def getReturnPhoto(campaignId: Long, orderId: Long, returnId: Long, itemId: Long, imageHash: String): Request[Either[ResponseException[String, Exception], File]] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/campaigns/${campaignId}/orders/${orderId}/returns/${returnId}/decision/${itemId}/image/${imageHash}")
      .contentType("application/json")
      .response(asJson[File])

  /**
   * Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
   * 
   * Expected answers:
   *   code 200 : GetReturnsResponse (Постраничные возвраты партнера.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
   * @param limit Количество значений на одной странице. 
   * @param orderIds Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. 
   * @param statuses Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую. 
   * @param `type` Тип заказа для фильтрации:  * `RETURN` — возврат.  * `UNREDEEMED` — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
   * @param fromDate Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. 
   * @param toDate Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. 
   * @param fromDate2 {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `fromDate`.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления. 
   * @param toDate2 {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `toDate`.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления. 
   */
  def getReturns(campaignId: Long, pageToken: Option[String] = None, limit: Option[Int] = None, orderIds: Seq[Long], statuses: Seq[RefundStatusType], `type`: Option[ReturnType] = None, fromDate: Option[LocalDate] = None, toDate: Option[LocalDate] = None, fromDate2: Option[LocalDate] = None, toDate2: Option[LocalDate] = None): Request[Either[ResponseException[String, Exception], GetReturnsResponse]] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/campaigns/${campaignId}/returns?page_token=${ pageToken }&limit=${ limit }&orderIds=${ orderIds }&statuses=${ statuses }&type=${ `type` }&fromDate=${ fromDate }&toDate=${ toDate }&from_date=${ fromDate2 }&to_date=${ toDate2 }")
      .contentType("application/json")
      .response(asJson[GetReturnsResponse])

  /**
   * Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
   * 
   * Expected answers:
   *   code 200 : EmptyApiResponse (Детали возврата.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param orderId Идентификатор заказа.
   * @param returnId Идентификатор возврата.
   * @param setReturnDecisionRequest 
   */
  def setReturnDecision(campaignId: Long, orderId: Long, returnId: Long, setReturnDecisionRequest: SetReturnDecisionRequest): Request[Either[ResponseException[String, Exception], EmptyApiResponse]] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/campaigns/${campaignId}/orders/${orderId}/returns/${returnId}/decision")
      .contentType("application/json")
      .body(setReturnDecisionRequest)
      .response(asJson[EmptyApiResponse])

  /**
   * Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
   * 
   * Expected answers:
   *   code 200 : EmptyApiResponse (Статус выполнения операции.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param orderId Идентификатор заказа.
   * @param returnId Идентификатор возврата.
   */
  def submitReturnDecision(campaignId: Long, orderId: Long, returnId: Long): Request[Either[ResponseException[String, Exception], EmptyApiResponse]] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/campaigns/${campaignId}/orders/${orderId}/returns/${returnId}/decision/submit")
      .contentType("application/json")
      .response(asJson[EmptyApiResponse])

}
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

import org.openapitools.client.model.AddHiddenOffersRequest
import org.openapitools.client.model.ApiClientDataErrorResponse
import org.openapitools.client.model.ApiForbiddenErrorResponse
import org.openapitools.client.model.ApiLimitErrorResponse
import org.openapitools.client.model.ApiLockedErrorResponse
import org.openapitools.client.model.ApiNotFoundErrorResponse
import org.openapitools.client.model.ApiServerErrorResponse
import org.openapitools.client.model.ApiUnauthorizedErrorResponse
import org.openapitools.client.model.DeleteHiddenOffersRequest
import org.openapitools.client.model.EmptyApiResponse
import org.openapitools.client.model.GetHiddenOffersResponse
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object HiddenOffersApi {

  def apply(baseUrl: String = "https://api.partner.market.yandex.ru") = new HiddenOffersApi(baseUrl)
}

class HiddenOffersApi(baseUrl: String) {

  /**
   * Скрывает товары магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
   * 
   * Expected answers:
   *   code 200 : EmptyApiResponse (Настройки скрытия получены и скоро вступят в силу.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 423 : ApiLockedErrorResponse (К ресурсу нельзя применить указанный метод.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param addHiddenOffersRequest Запрос на скрытие оферов.
   */
  def addHiddenOffers(campaignId: Long, addHiddenOffersRequest: AddHiddenOffersRequest): ApiRequest[EmptyApiResponse] =
    ApiRequest[EmptyApiResponse](ApiMethods.POST, baseUrl, "/campaigns/{campaignId}/hidden-offers", "application/json")
      .withBody(addHiddenOffersRequest)
      .withPathParam("campaignId", campaignId)
      .withSuccessResponse[EmptyApiResponse](200)
      .withErrorResponse[ApiClientDataErrorResponse](400)
      .withErrorResponse[ApiUnauthorizedErrorResponse](401)
      .withErrorResponse[ApiForbiddenErrorResponse](403)
      .withErrorResponse[ApiLimitErrorResponse](420)
      .withErrorResponse[ApiLockedErrorResponse](423)
      .withErrorResponse[ApiServerErrorResponse](500)
      

  /**
   * Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
   * 
   * Expected answers:
   *   code 200 : EmptyApiResponse (Показ товаров возобновлен.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 423 : ApiLockedErrorResponse (К ресурсу нельзя применить указанный метод.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param deleteHiddenOffersRequest Запрос на возобновление показа оферов.
   */
  def deleteHiddenOffers(campaignId: Long, deleteHiddenOffersRequest: DeleteHiddenOffersRequest): ApiRequest[EmptyApiResponse] =
    ApiRequest[EmptyApiResponse](ApiMethods.POST, baseUrl, "/campaigns/{campaignId}/hidden-offers/delete", "application/json")
      .withBody(deleteHiddenOffersRequest)
      .withPathParam("campaignId", campaignId)
      .withSuccessResponse[EmptyApiResponse](200)
      .withErrorResponse[ApiClientDataErrorResponse](400)
      .withErrorResponse[ApiUnauthorizedErrorResponse](401)
      .withErrorResponse[ApiForbiddenErrorResponse](403)
      .withErrorResponse[ApiNotFoundErrorResponse](404)
      .withErrorResponse[ApiLimitErrorResponse](420)
      .withErrorResponse[ApiLockedErrorResponse](423)
      .withErrorResponse[ApiServerErrorResponse](500)
      

  /**
   * Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
   * 
   * Expected answers:
   *   code 200 : GetHiddenOffersResponse (Информация о скрытых вами товарах.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param offerId Идентификатор скрытого предложения. 
   * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
   * @param limit Количество значений на одной странице. 
   * @param offset Позиция в списке, начиная с которой возвращаются результаты ответа.  Используется вместе с параметром `limit`.  Если задан `offset`, параметры `page_number` и `page_size` игнорируются.  `offset` игнорируется, если задан `page_token`. 
   * @param page Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
   * @param pageSize Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
   */
  def getHiddenOffers(campaignId: Long, offerId: Seq[String], pageToken: Option[String] = None, limit: Option[Int] = None, offset: Option[Int] = None, page: Option[Int] = None, pageSize: Option[Int] = None): ApiRequest[GetHiddenOffersResponse] =
    ApiRequest[GetHiddenOffersResponse](ApiMethods.GET, baseUrl, "/campaigns/{campaignId}/hidden-offers", "application/json")
      .withQueryParam("offer_id", ArrayValues(offerId, CSV))
      .withQueryParam("page_token", pageToken)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("page", page)
      .withQueryParam("pageSize", pageSize)
      .withPathParam("campaignId", campaignId)
      .withSuccessResponse[GetHiddenOffersResponse](200)
      .withErrorResponse[ApiClientDataErrorResponse](400)
      .withErrorResponse[ApiUnauthorizedErrorResponse](401)
      .withErrorResponse[ApiForbiddenErrorResponse](403)
      .withErrorResponse[ApiLimitErrorResponse](420)
      .withErrorResponse[ApiServerErrorResponse](500)
      



}


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
import org.openapitools.client.model.ApiLockedErrorResponse
import org.openapitools.client.model.ApiNotFoundErrorResponse
import org.openapitools.client.model.ApiServerErrorResponse
import org.openapitools.client.model.ApiUnauthorizedErrorResponse
import org.openapitools.client.model.ConfirmPricesRequest
import org.openapitools.client.model.EmptyApiResponse
import org.openapitools.client.model.GetQuarantineOffersRequest
import org.openapitools.client.model.GetQuarantineOffersResponse
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object PriceQuarantineApi {

  def apply(baseUrl: String = "https://api.partner.market.yandex.ru") = new PriceQuarantineApi(baseUrl)
}

class PriceQuarantineApi(baseUrl: String) {

  /**
   * Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
   * 
   * Expected answers:
   *   code 200 : EmptyApiResponse (Ответ 200 обозначает, что цены подтверждены.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 423 : ApiLockedErrorResponse (К ресурсу нельзя применить указанный метод.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param confirmPricesRequest 
   */
  def confirmBusinessPrices(businessId: Long, confirmPricesRequest: ConfirmPricesRequest): ApiRequest[EmptyApiResponse] =
    ApiRequest[EmptyApiResponse](ApiMethods.POST, baseUrl, "/businesses/{businessId}/price-quarantine/confirm", "application/json")
      .withBody(confirmPricesRequest)
      .withPathParam("businessId", businessId)
      .withSuccessResponse[EmptyApiResponse](200)
      .withErrorResponse[ApiClientDataErrorResponse](400)
      .withErrorResponse[ApiUnauthorizedErrorResponse](401)
      .withErrorResponse[ApiForbiddenErrorResponse](403)
      .withErrorResponse[ApiNotFoundErrorResponse](404)
      .withErrorResponse[ApiLimitErrorResponse](420)
      .withErrorResponse[ApiLockedErrorResponse](423)
      .withErrorResponse[ApiServerErrorResponse](500)
      

  /**
   * Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
   * 
   * Expected answers:
   *   code 200 : EmptyApiResponse (Ответ 200 обозначает, что цены подтверждены.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 423 : ApiLockedErrorResponse (К ресурсу нельзя применить указанный метод.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param confirmPricesRequest 
   */
  def confirmCampaignPrices(campaignId: Long, confirmPricesRequest: ConfirmPricesRequest): ApiRequest[EmptyApiResponse] =
    ApiRequest[EmptyApiResponse](ApiMethods.POST, baseUrl, "/campaigns/{campaignId}/price-quarantine/confirm", "application/json")
      .withBody(confirmPricesRequest)
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
   * Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
   * 
   * Expected answers:
   *   code 200 : GetQuarantineOffersResponse (Список товаров в карантине.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param getQuarantineOffersRequest 
   * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
   * @param limit Количество значений на одной странице. 
   */
  def getBusinessQuarantineOffers(businessId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String] = None, limit: Option[Int] = None): ApiRequest[GetQuarantineOffersResponse] =
    ApiRequest[GetQuarantineOffersResponse](ApiMethods.POST, baseUrl, "/businesses/{businessId}/price-quarantine", "application/json")
      .withBody(getQuarantineOffersRequest)
      .withQueryParam("page_token", pageToken)
      .withQueryParam("limit", limit)
      .withPathParam("businessId", businessId)
      .withSuccessResponse[GetQuarantineOffersResponse](200)
      .withErrorResponse[ApiClientDataErrorResponse](400)
      .withErrorResponse[ApiUnauthorizedErrorResponse](401)
      .withErrorResponse[ApiForbiddenErrorResponse](403)
      .withErrorResponse[ApiNotFoundErrorResponse](404)
      .withErrorResponse[ApiLimitErrorResponse](420)
      .withErrorResponse[ApiServerErrorResponse](500)
      

  /**
   * Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
   * 
   * Expected answers:
   *   code 200 : GetQuarantineOffersResponse (Список товаров в карантине.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param getQuarantineOffersRequest 
   * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
   * @param limit Количество значений на одной странице. 
   */
  def getCampaignQuarantineOffers(campaignId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String] = None, limit: Option[Int] = None): ApiRequest[GetQuarantineOffersResponse] =
    ApiRequest[GetQuarantineOffersResponse](ApiMethods.POST, baseUrl, "/campaigns/{campaignId}/price-quarantine", "application/json")
      .withBody(getQuarantineOffersRequest)
      .withQueryParam("page_token", pageToken)
      .withQueryParam("limit", limit)
      .withPathParam("campaignId", campaignId)
      .withSuccessResponse[GetQuarantineOffersResponse](200)
      .withErrorResponse[ApiClientDataErrorResponse](400)
      .withErrorResponse[ApiUnauthorizedErrorResponse](401)
      .withErrorResponse[ApiForbiddenErrorResponse](403)
      .withErrorResponse[ApiNotFoundErrorResponse](404)
      .withErrorResponse[ApiLimitErrorResponse](420)
      .withErrorResponse[ApiServerErrorResponse](500)
      



}

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
import org.openapitools.client.model.EmptyApiResponse
import org.openapitools.client.model.GetPricesByOfferIdsRequest
import org.openapitools.client.model.GetPricesByOfferIdsResponse
import org.openapitools.client.model.GetPricesResponse
import org.openapitools.client.model.SuggestPricesRequest
import org.openapitools.client.model.SuggestPricesResponse
import org.openapitools.client.model.UpdateBusinessPricesRequest
import org.openapitools.client.model.UpdatePricesRequest
import org.openapitools.client.core.JsonSupport._
import sttp.client4._
import sttp.model.Method

object PricesApi {
  def apply(baseUrl: String = "https://api.partner.market.yandex.ru") = new PricesApi(baseUrl)
}

class PricesApi(baseUrl: String) {

  /**
   * {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** ```(количество товаров партнера на витрине) * 25``` товаров в сутки| |-| 
   * 
   * Expected answers:
   *   code 200 : GetPricesResponse (Список всех товаров с установленными ценами.)
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
   * @param archived Фильтр по нахождению в архиве.
   */
  def getPrices(campaignId: Long, pageToken: Option[String] = None, limit: Option[Int] = None, archived: Option[Boolean] = None): Request[Either[ResponseException[String, Exception], GetPricesResponse]] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/campaigns/${campaignId}/offer-prices?page_token=${ pageToken }&limit=${ limit }&archived=${ archived }")
      .contentType("application/json")
      .response(asJson[GetPricesResponse])

  /**
   * Возвращает список цен на указанные товары в магазине.  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — количество товаров на витрине * 25) 
   * 
   * Expected answers:
   *   code 200 : GetPricesByOfferIdsResponse (Список товаров с установленными для заданного магазина ценами.)
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
   * @param getPricesByOfferIdsRequest 
   */
  def getPricesByOfferIds(campaignId: Long, pageToken: Option[String] = None, limit: Option[Int] = None, getPricesByOfferIdsRequest: Option[GetPricesByOfferIdsRequest] = None): Request[Either[ResponseException[String, Exception], GetPricesByOfferIdsResponse]] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/campaigns/${campaignId}/offer-prices?page_token=${ pageToken }&limit=${ limit }")
      .contentType("application/json")
      .body(getPricesByOfferIdsRequest)
      .response(asJson[GetPricesByOfferIdsResponse])

  /**
   * {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \"\" %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
   * 
   * Expected answers:
   *   code 200 : SuggestPricesResponse (Список цен для продвижения на Маркете.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param suggestPricesRequest 
   */
  def getSuggestedPrices(campaignId: Long, suggestPricesRequest: SuggestPricesRequest): Request[Either[ResponseException[String, Exception], SuggestPricesResponse]] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/campaigns/${campaignId}/offer-prices/suggestions")
      .contentType("application/json")
      .body(suggestPricesRequest)
      .response(asJson[SuggestPricesResponse])

  /**
   * Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
   * 
   * Expected answers:
   *   code 200 : EmptyApiResponse (Маркет принял информацию о новых ценах.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 423 : ApiLockedErrorResponse (К ресурсу нельзя применить указанный метод.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param updateBusinessPricesRequest 
   */
  def updateBusinessPrices(businessId: Long, updateBusinessPricesRequest: UpdateBusinessPricesRequest): Request[Either[ResponseException[String, Exception], EmptyApiResponse]] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/businesses/${businessId}/offer-prices/updates")
      .contentType("application/json")
      .body(updateBusinessPricesRequest)
      .response(asJson[EmptyApiResponse])

  /**
   * Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
   * 
   * Expected answers:
   *   code 200 : EmptyApiResponse (Маркет принял информацию о новых ценах.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 423 : ApiLockedErrorResponse (К ресурсу нельзя применить указанный метод.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param updatePricesRequest 
   */
  def updatePrices(campaignId: Long, updatePricesRequest: UpdatePricesRequest): Request[Either[ResponseException[String, Exception], EmptyApiResponse]] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/campaigns/${campaignId}/offer-prices/updates")
      .contentType("application/json")
      .body(updatePricesRequest)
      .response(asJson[EmptyApiResponse])

}

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
import org.openapitools.client.model.DeletePromoOffersRequest
import org.openapitools.client.model.DeletePromoOffersResponse
import org.openapitools.client.model.GetPromoOffersRequest
import org.openapitools.client.model.GetPromoOffersResponse
import org.openapitools.client.model.GetPromosRequest
import org.openapitools.client.model.GetPromosResponse
import org.openapitools.client.model.UpdatePromoOffersRequest
import org.openapitools.client.model.UpdatePromoOffersResponse
import org.openapitools.client.core.JsonSupport._
import sttp.client4._
import sttp.model.Method

object PromosApi {
  def apply(baseUrl: String = "https://api.partner.market.yandex.ru") = new PromosApi(baseUrl)
}

class PromosApi(baseUrl: String) {

  /**
   * Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
   * 
   * Expected answers:
   *   code 200 : DeletePromoOffersResponse (Результат удаления товаров из акции.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param deletePromoOffersRequest 
   */
  def deletePromoOffers(businessId: Long, deletePromoOffersRequest: DeletePromoOffersRequest): Request[Either[ResponseException[String, Exception], DeletePromoOffersResponse]] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/businesses/${businessId}/promos/offers/delete")
      .contentType("application/json")
      .body(deletePromoOffersRequest)
      .response(asJson[DeletePromoOffersResponse])

  /**
   * Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре `limit` не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 
   * 
   * Expected answers:
   *   code 200 : GetPromoOffersResponse (Список товаров, которые участвуют или могут участвовать в акции.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param getPromoOffersRequest 
   * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
   * @param limit Количество значений на одной странице. 
   */
  def getPromoOffers(businessId: Long, getPromoOffersRequest: GetPromoOffersRequest, pageToken: Option[String] = None, limit: Option[Int] = None): Request[Either[ResponseException[String, Exception], GetPromoOffersResponse]] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/businesses/${businessId}/promos/offers?page_token=${ pageToken }&limit=${ limit }")
      .contentType("application/json")
      .body(getPromoOffersRequest)
      .response(asJson[GetPromoOffersResponse])

  /**
   * Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр `participation`.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
   * 
   * Expected answers:
   *   code 200 : GetPromosResponse (Список акций Маркета.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param getPromosRequest 
   */
  def getPromos(businessId: Long, getPromosRequest: Option[GetPromosRequest] = None): Request[Either[ResponseException[String, Exception], GetPromosResponse]] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/businesses/${businessId}/promos")
      .contentType("application/json")
      .body(getPromosRequest)
      .response(asJson[GetPromosResponse])

  /**
   * Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
   * 
   * Expected answers:
   *   code 200 : UpdatePromoOffersResponse (Результат добавления товаров в акцию или обновления их цен.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param updatePromoOffersRequest 
   */
  def updatePromoOffers(businessId: Long, updatePromoOffersRequest: UpdatePromoOffersRequest): Request[Either[ResponseException[String, Exception], UpdatePromoOffersResponse]] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/businesses/${businessId}/promos/offers/update")
      .contentType("application/json")
      .body(updatePromoOffersRequest)
      .response(asJson[UpdatePromoOffersResponse])

}
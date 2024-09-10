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
import org.openapitools.client.model.GetDeliveryServicesResponse
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object DeliveryServicesApi {

  def apply(baseUrl: String = "https://api.partner.market.yandex.ru") = new DeliveryServicesApi(baseUrl)
}

class DeliveryServicesApi(baseUrl: String) {

  /**
   * Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
   * 
   * Expected answers:
   *   code 200 : GetDeliveryServicesResponse (Информация о службах доставки.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   */
  def getDeliveryServices(): ApiRequest[GetDeliveryServicesResponse] =
    ApiRequest[GetDeliveryServicesResponse](ApiMethods.GET, baseUrl, "/delivery/services", "application/json")
      .withSuccessResponse[GetDeliveryServicesResponse](200)
      .withErrorResponse[ApiClientDataErrorResponse](400)
      .withErrorResponse[ApiUnauthorizedErrorResponse](401)
      .withErrorResponse[ApiForbiddenErrorResponse](403)
      .withErrorResponse[ApiNotFoundErrorResponse](404)
      .withErrorResponse[ApiLimitErrorResponse](420)
      .withErrorResponse[ApiServerErrorResponse](500)
      



}

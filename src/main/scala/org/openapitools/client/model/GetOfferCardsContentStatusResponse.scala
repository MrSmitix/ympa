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
package org.openapitools.client.model

import org.openapitools.client.model.ApiResponseStatusType._

  /**
   * Ответ со списком состояний товаров и пагинацией.
   */
case class GetOfferCardsContentStatusResponse(
  status: Option[ApiResponseStatusType] = None,
  result: Option[OfferCardsContentStatusDTO] = None
)

object GetOfferCardsContentStatusResponseEnums {

}

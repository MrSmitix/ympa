/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model
import java.time.LocalDate

case class GenerateUnitedOrdersRequest(
  /* Идентификатор бизнеса. */
  businessId: Long,

  /* Начало периода, включительно. */
  dateFrom: LocalDate,

  /* Конец периода, включительно. Максимальный период — 1 год. */
  dateTo: LocalDate,

  /* Список магазинов, которые нужны в отчете. */
  campaignIds: Option[List[Long]],

  /* Идентификатор акции, товары из которой нужны в отчете. */
  promoId: Option[String]

 )

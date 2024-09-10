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

import java.time.LocalDate

  /**
   * Данные, необходимые для генерации отчета. 
   */
case class GenerateUnitedOrdersRequest(
  /* Идентификатор бизнеса. */
  businessId: Long,
  /* Начало периода, включительно. */
  dateFrom: LocalDate,
  /* Конец периода, включительно. Максимальный период — 1 год. */
  dateTo: LocalDate,
  /* Список магазинов, которые нужны в отчете. */
  campaignIds: Option[Seq[Long]] = None,
  /* Идентификатор акции, товары из которой нужны в отчете. */
  promoId: Option[String] = None
)

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

import java.math.BigDecimal
import java.time.LocalDate
import org.openapitools.client.core.ApiModel

case class OrdersStatsPaymentDTO (
  /* Идентификатор денежного перевода. */
  id: Option[String] = None,
  /* Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`.  */
  date: Option[LocalDate] = None,
  `type`: Option[OrdersStatsPaymentType] = None,
  source: Option[OrdersStatsPaymentSourceType] = None,
  /* Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  */
  total: Option[BigDecimal] = None,
  paymentOrder: Option[OrdersStatsPaymentOrderDTO] = None
) extends ApiModel

object OrdersStatsPaymentDTOEnums {

}

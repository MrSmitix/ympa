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
import org.openapitools.client.model.ShowsSalesGroupingType._

  /**
   * Данные, необходимые для генерации отчета.
   */
case class GenerateShowsSalesReportRequest(
  /* Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу.  */
  businessId: Option[Long] = None,
  /* Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу.  */
  campaignId: Option[Long] = None,
  /* Начало периода, включительно. */
  dateFrom: LocalDate,
  /* Конец периода, включительно. */
  dateTo: LocalDate,
  grouping: ShowsSalesGroupingType
)

object GenerateShowsSalesReportRequestEnums {

}

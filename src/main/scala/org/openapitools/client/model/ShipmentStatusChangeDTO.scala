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

import java.time.OffsetDateTime
import org.openapitools.client.model.ShipmentStatusType._

  /**
   * Статус отгрузки.
   */
case class ShipmentStatusChangeDTO(
  status: Option[ShipmentStatusType] = None,
  /* Описание статуса отгрузки. */
  description: Option[String] = None,
  /* Время последнего изменения статуса отгрузки. */
  updateTime: Option[OffsetDateTime] = None
)

object ShipmentStatusChangeDTOEnums {

}

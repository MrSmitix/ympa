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
import org.openapitools.client.core.ApiModel

case class ShipmentInfoDTO (
  /* Идентификатор отгрузки. */
  id: Option[Long] = None,
  /* Начало планового интервала отгрузки. */
  planIntervalFrom: Option[OffsetDateTime] = None,
  /* Конец планового интервала отгрузки. */
  planIntervalTo: Option[OffsetDateTime] = None,
  shipmentType: Option[ShipmentType] = None,
  warehouse: Option[PartnerShipmentWarehouseDTO] = None,
  warehouseTo: Option[PartnerShipmentWarehouseDTO] = None,
  /* Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`. */
  externalId: Option[String] = None,
  deliveryService: Option[DeliveryServiceDTO] = None,
  palletsCount: Option[PalletsCountDTO] = None,
  /* Идентификаторы заказов в отгрузке. */
  orderIds: Set[Long],
  /* Количество заказов, которое Маркет запланировал к отгрузке. */
  draftCount: Option[Int] = None,
  /* Количество заказов, которое Маркет подтвердил к отгрузке. */
  plannedCount: Option[Int] = None,
  /* Количество заказов, принятых в сортировочном центре или пункте приема. */
  factCount: Option[Int] = None,
  status: Option[ShipmentStatusType] = None,
  /* Описание статуса отгрузки. */
  statusDescription: Option[String] = None,
  /* Время последнего изменения статуса отгрузки. */
  statusUpdateTime: Option[OffsetDateTime] = None
) extends ApiModel

object ShipmentInfoDTOEnums {

}

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
import java.time.OffsetDateTime

case class BaseShipmentDTO(
  /* Идентификатор отгрузки. */
  id: Option[Long],

  /* Начало планового интервала отгрузки. */
  planIntervalFrom: Option[OffsetDateTime],

  /* Конец планового интервала отгрузки. */
  planIntervalTo: Option[OffsetDateTime],

  shipmentType: Option[ShipmentType],

  warehouse: Option[PartnerShipmentWarehouseDTO],

  warehouseTo: Option[PartnerShipmentWarehouseDTO],

  /* Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`. */
  externalId: Option[String],

  deliveryService: Option[DeliveryServiceDTO],

  palletsCount: Option[PalletsCountDTO],

  /* Идентификаторы заказов в отгрузке. */
  orderIds: Set[Long],

  /* Количество заказов, которое Маркет запланировал к отгрузке. */
  draftCount: Option[Int],

  /* Количество заказов, которое Маркет подтвердил к отгрузке. */
  plannedCount: Option[Int],

  /* Количество заказов, принятых в сортировочном центре или пункте приема. */
  factCount: Option[Int]

 )

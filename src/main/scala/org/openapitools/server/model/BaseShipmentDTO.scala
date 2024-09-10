package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Информация об отгрузке.
 *
 * @param id Идентификатор отгрузки. for example: ''null''
 * @param planIntervalFrom Начало планового интервала отгрузки. for example: ''null''
 * @param planIntervalTo Конец планового интервала отгрузки. for example: ''null''
 * @param shipmentType  for example: ''null''
 * @param warehouse  for example: ''null''
 * @param warehouseTo  for example: ''null''
 * @param externalId Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`. for example: ''null''
 * @param deliveryService  for example: ''null''
 * @param palletsCount  for example: ''null''
 * @param orderIds Идентификаторы заказов в отгрузке. for example: ''null''
 * @param draftCount Количество заказов, которое Маркет запланировал к отгрузке. for example: ''null''
 * @param plannedCount Количество заказов, которое Маркет подтвердил к отгрузке. for example: ''null''
 * @param factCount Количество заказов, принятых в сортировочном центре или пункте приема. for example: ''null''
*/
final case class BaseShipmentDTO (
  id: Option[Long] = None,
  planIntervalFrom: Option[OffsetDateTime] = None,
  planIntervalTo: Option[OffsetDateTime] = None,
  shipmentType: Option[ShipmentType] = None,
  warehouse: Option[PartnerShipmentWarehouseDTO] = None,
  warehouseTo: Option[PartnerShipmentWarehouseDTO] = None,
  externalId: Option[String] = None,
  deliveryService: Option[DeliveryServiceDTO] = None,
  palletsCount: Option[PalletsCountDTO] = None,
  orderIds: Set[Long],
  draftCount: Option[Int] = None,
  plannedCount: Option[Int] = None,
  factCount: Option[Int] = None
)


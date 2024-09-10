
package org.openapitools.client.model

import java.time.OffsetDateTime

case class BaseShipmentDTO (
    /* Идентификатор отгрузки. */
    _id: Option[Long],
    /* Начало планового интервала отгрузки. */
    _planIntervalFrom: Option[OffsetDateTime],
    /* Конец планового интервала отгрузки. */
    _planIntervalTo: Option[OffsetDateTime],
    _shipmentType: Option[ShipmentType],
    _warehouse: Option[PartnerShipmentWarehouseDTO],
    _warehouseTo: Option[PartnerShipmentWarehouseDTO],
    /* Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`. */
    _externalId: Option[String],
    _deliveryService: Option[DeliveryServiceDTO],
    _palletsCount: Option[PalletsCountDTO],
    /* Идентификаторы заказов в отгрузке. */
    _orderIds: Set[Long],
    /* Количество заказов, которое Маркет запланировал к отгрузке. */
    _draftCount: Option[Integer],
    /* Количество заказов, которое Маркет подтвердил к отгрузке. */
    _plannedCount: Option[Integer],
    /* Количество заказов, принятых в сортировочном центре или пункте приема. */
    _factCount: Option[Integer]
)
object BaseShipmentDTO {
    def toStringBody(var_id: Object, var_planIntervalFrom: Object, var_planIntervalTo: Object, var_shipmentType: Object, var_warehouse: Object, var_warehouseTo: Object, var_externalId: Object, var_deliveryService: Object, var_palletsCount: Object, var_orderIds: Object, var_draftCount: Object, var_plannedCount: Object, var_factCount: Object) =
        s"""
        | {
        | "id":$var_id,"planIntervalFrom":$var_planIntervalFrom,"planIntervalTo":$var_planIntervalTo,"shipmentType":$var_shipmentType,"warehouse":$var_warehouse,"warehouseTo":$var_warehouseTo,"externalId":$var_externalId,"deliveryService":$var_deliveryService,"palletsCount":$var_palletsCount,"orderIds":$var_orderIds,"draftCount":$var_draftCount,"plannedCount":$var_plannedCount,"factCount":$var_factCount
        | }
        """.stripMargin
}

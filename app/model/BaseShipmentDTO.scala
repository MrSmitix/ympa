package model

import play.api.libs.json._
import java.time.OffsetDateTime
import scala.collection.immutable.Set

/**
  * Информация об отгрузке.
  * @param id Идентификатор отгрузки.
  * @param planIntervalFrom Начало планового интервала отгрузки.
  * @param planIntervalTo Конец планового интервала отгрузки.
  * @param externalId Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
  * @param orderIds Идентификаторы заказов в отгрузке.
  * @param draftCount Количество заказов, которое Маркет запланировал к отгрузке.
  * @param plannedCount Количество заказов, которое Маркет подтвердил к отгрузке.
  * @param factCount Количество заказов, принятых в сортировочном центре или пункте приема.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class BaseShipmentDTO(
  id: Option[Long],
  planIntervalFrom: Option[OffsetDateTime],
  planIntervalTo: Option[OffsetDateTime],
  shipmentType: Option[ShipmentType],
  warehouse: Option[PartnerShipmentWarehouseDTO],
  warehouseTo: Option[PartnerShipmentWarehouseDTO],
  externalId: Option[String],
  deliveryService: Option[DeliveryServiceDTO],
  palletsCount: Option[PalletsCountDTO],
  orderIds: Set[Long],
  draftCount: Option[Int],
  plannedCount: Option[Int],
  factCount: Option[Int]
)

object BaseShipmentDTO {
  implicit lazy val baseShipmentDTOJsonFormat: Format[BaseShipmentDTO] = Json.format[BaseShipmentDTO]
}


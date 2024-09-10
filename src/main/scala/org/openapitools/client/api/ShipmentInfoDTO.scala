package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import ShipmentInfoDTO._

case class ShipmentInfoDTO (
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
  draftCount: Option[Integer],
/* Количество заказов, которое Маркет подтвердил к отгрузке. */
  plannedCount: Option[Integer],
/* Количество заказов, принятых в сортировочном центре или пункте приема. */
  factCount: Option[Integer],
status: Option[ShipmentStatusType],
/* Описание статуса отгрузки. */
  statusDescription: Option[String],
/* Время последнего изменения статуса отгрузки. */
  statusUpdateTime: Option[OffsetDateTime])

object ShipmentInfoDTO {
  import DateTimeCodecs._

  implicit val ShipmentInfoDTOCodecJson: CodecJson[ShipmentInfoDTO] = CodecJson.derive[ShipmentInfoDTO]
  implicit val ShipmentInfoDTODecoder: EntityDecoder[ShipmentInfoDTO] = jsonOf[ShipmentInfoDTO]
  implicit val ShipmentInfoDTOEncoder: EntityEncoder[ShipmentInfoDTO] = jsonEncoderOf[ShipmentInfoDTO]
}

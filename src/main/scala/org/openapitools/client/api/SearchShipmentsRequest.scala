package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import SearchShipmentsRequest._

case class SearchShipmentsRequest (
  /* Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`.  */
  dateFrom: LocalDate,
/* Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`.  */
  dateTo: LocalDate,
/* Список статусов отгрузок. */
  statuses: Option[Set[ShipmentStatusType]],
/* Список идентификаторов заказов из отгрузок. */
  orderIds: Option[Set[Long]],
/* Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`.  */
  cancelledOrders: Option[Boolean])

object SearchShipmentsRequest {
  import DateTimeCodecs._

  implicit val SearchShipmentsRequestCodecJson: CodecJson[SearchShipmentsRequest] = CodecJson.derive[SearchShipmentsRequest]
  implicit val SearchShipmentsRequestDecoder: EntityDecoder[SearchShipmentsRequest] = jsonOf[SearchShipmentsRequest]
  implicit val SearchShipmentsRequestEncoder: EntityEncoder[SearchShipmentsRequest] = jsonEncoderOf[SearchShipmentsRequest]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderShipmentDTO._

case class OrderShipmentDTO (
  /* Идентификатор посылки, присвоенный Маркетом. */
  id: Option[Long],
/* Формат даты: `ДД-ММ-ГГГГ`.  */
  shipmentDate: Option[String],
/* **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки.  */
  shipmentTime: Option[String],
/* **Только для модели DBS**  Информация для отслеживания перемещений посылки.  */
  tracks: Option[List[OrderTrackDTO]],
/* Список грузовых мест. */
  boxes: Option[List[OrderParcelBoxDTO]])

object OrderShipmentDTO {
  import DateTimeCodecs._

  implicit val OrderShipmentDTOCodecJson: CodecJson[OrderShipmentDTO] = CodecJson.derive[OrderShipmentDTO]
  implicit val OrderShipmentDTODecoder: EntityDecoder[OrderShipmentDTO] = jsonOf[OrderShipmentDTO]
  implicit val OrderShipmentDTOEncoder: EntityEncoder[OrderShipmentDTO] = jsonEncoderOf[OrderShipmentDTO]
}

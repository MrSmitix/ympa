package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderCourierDTO._

case class OrderCourierDTO (
  /* Полное имя курьера. */
  fullName: Option[String],
/* Номер телефона курьера. */
  phone: Option[String],
/* Добавочный номер телефона. */
  phoneExtension: Option[String],
/* Номер транспортного средства. */
  vehicleNumber: Option[String],
/* Описание машины. Например, модель и цвет. */
  vehicleDescription: Option[String])

object OrderCourierDTO {
  import DateTimeCodecs._

  implicit val OrderCourierDTOCodecJson: CodecJson[OrderCourierDTO] = CodecJson.derive[OrderCourierDTO]
  implicit val OrderCourierDTODecoder: EntityDecoder[OrderCourierDTO] = jsonOf[OrderCourierDTO]
  implicit val OrderCourierDTOEncoder: EntityEncoder[OrderCourierDTO] = jsonEncoderOf[OrderCourierDTO]
}

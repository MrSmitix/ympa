package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderStateDTO._

case class OrderStateDTO (
  /* Идентификатор заказа. */
  id: Long,
status: OrderStatusType,
substatus: Option[OrderSubstatusType])

object OrderStateDTO {
  import DateTimeCodecs._

  implicit val OrderStateDTOCodecJson: CodecJson[OrderStateDTO] = CodecJson.derive[OrderStateDTO]
  implicit val OrderStateDTODecoder: EntityDecoder[OrderStateDTO] = jsonOf[OrderStateDTO]
  implicit val OrderStateDTOEncoder: EntityEncoder[OrderStateDTO] = jsonEncoderOf[OrderStateDTO]
}

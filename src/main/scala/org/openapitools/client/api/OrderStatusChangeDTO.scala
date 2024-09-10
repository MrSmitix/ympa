package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderStatusChangeDTO._

case class OrderStatusChangeDTO (
  status: OrderStatusType,
substatus: Option[OrderSubstatusType],
delivery: Option[OrderStatusChangeDeliveryDTO])

object OrderStatusChangeDTO {
  import DateTimeCodecs._

  implicit val OrderStatusChangeDTOCodecJson: CodecJson[OrderStatusChangeDTO] = CodecJson.derive[OrderStatusChangeDTO]
  implicit val OrderStatusChangeDTODecoder: EntityDecoder[OrderStatusChangeDTO] = jsonOf[OrderStatusChangeDTO]
  implicit val OrderStatusChangeDTOEncoder: EntityEncoder[OrderStatusChangeDTO] = jsonEncoderOf[OrderStatusChangeDTO]
}

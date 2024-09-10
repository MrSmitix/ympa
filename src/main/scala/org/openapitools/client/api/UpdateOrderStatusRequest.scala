package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateOrderStatusRequest._

case class UpdateOrderStatusRequest (
  order: OrderStatusChangeDTO)

object UpdateOrderStatusRequest {
  import DateTimeCodecs._

  implicit val UpdateOrderStatusRequestCodecJson: CodecJson[UpdateOrderStatusRequest] = CodecJson.derive[UpdateOrderStatusRequest]
  implicit val UpdateOrderStatusRequestDecoder: EntityDecoder[UpdateOrderStatusRequest] = jsonOf[UpdateOrderStatusRequest]
  implicit val UpdateOrderStatusRequestEncoder: EntityEncoder[UpdateOrderStatusRequest] = jsonEncoderOf[UpdateOrderStatusRequest]
}

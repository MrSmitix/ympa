package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateOrderStatusesRequest._

case class UpdateOrderStatusesRequest (
  /* Список заказов. */
  orders: List[OrderStateDTO])

object UpdateOrderStatusesRequest {
  import DateTimeCodecs._

  implicit val UpdateOrderStatusesRequestCodecJson: CodecJson[UpdateOrderStatusesRequest] = CodecJson.derive[UpdateOrderStatusesRequest]
  implicit val UpdateOrderStatusesRequestDecoder: EntityDecoder[UpdateOrderStatusesRequest] = jsonOf[UpdateOrderStatusesRequest]
  implicit val UpdateOrderStatusesRequestEncoder: EntityEncoder[UpdateOrderStatusesRequest] = jsonEncoderOf[UpdateOrderStatusesRequest]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AcceptOrderCancellationRequest._

case class AcceptOrderCancellationRequest (
  /* Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов.  */
  accepted: Boolean,
reason: Option[OrderCancellationReasonType])

object AcceptOrderCancellationRequest {
  import DateTimeCodecs._

  implicit val AcceptOrderCancellationRequestCodecJson: CodecJson[AcceptOrderCancellationRequest] = CodecJson.derive[AcceptOrderCancellationRequest]
  implicit val AcceptOrderCancellationRequestDecoder: EntityDecoder[AcceptOrderCancellationRequest] = jsonOf[AcceptOrderCancellationRequest]
  implicit val AcceptOrderCancellationRequestEncoder: EntityEncoder[AcceptOrderCancellationRequest] = jsonEncoderOf[AcceptOrderCancellationRequest]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SetOrderDeliveryDateRequest._

case class SetOrderDeliveryDateRequest (
  dates: OrderDeliveryDateDTO,
reason: OrderDeliveryDateReasonType)

object SetOrderDeliveryDateRequest {
  import DateTimeCodecs._

  implicit val SetOrderDeliveryDateRequestCodecJson: CodecJson[SetOrderDeliveryDateRequest] = CodecJson.derive[SetOrderDeliveryDateRequest]
  implicit val SetOrderDeliveryDateRequestDecoder: EntityDecoder[SetOrderDeliveryDateRequest] = jsonOf[SetOrderDeliveryDateRequest]
  implicit val SetOrderDeliveryDateRequestEncoder: EntityEncoder[SetOrderDeliveryDateRequest] = jsonEncoderOf[SetOrderDeliveryDateRequest]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateOrderStatusResponse._

case class UpdateOrderStatusResponse (
  order: Option[OrderDTO])

object UpdateOrderStatusResponse {
  import DateTimeCodecs._

  implicit val UpdateOrderStatusResponseCodecJson: CodecJson[UpdateOrderStatusResponse] = CodecJson.derive[UpdateOrderStatusResponse]
  implicit val UpdateOrderStatusResponseDecoder: EntityDecoder[UpdateOrderStatusResponse] = jsonOf[UpdateOrderStatusResponse]
  implicit val UpdateOrderStatusResponseEncoder: EntityEncoder[UpdateOrderStatusResponse] = jsonEncoderOf[UpdateOrderStatusResponse]
}

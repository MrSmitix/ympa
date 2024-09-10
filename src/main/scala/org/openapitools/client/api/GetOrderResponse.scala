package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetOrderResponse._

case class GetOrderResponse (
  order: Option[OrderDTO])

object GetOrderResponse {
  import DateTimeCodecs._

  implicit val GetOrderResponseCodecJson: CodecJson[GetOrderResponse] = CodecJson.derive[GetOrderResponse]
  implicit val GetOrderResponseDecoder: EntityDecoder[GetOrderResponse] = jsonOf[GetOrderResponse]
  implicit val GetOrderResponseEncoder: EntityEncoder[GetOrderResponse] = jsonEncoderOf[GetOrderResponse]
}

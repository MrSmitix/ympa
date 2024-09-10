package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetOrdersResponse._

case class GetOrdersResponse (
  pager: Option[FlippingPagerDTO],
/* Модель заказа.  */
  orders: List[OrderDTO],
paging: Option[ForwardScrollingPagerDTO])

object GetOrdersResponse {
  import DateTimeCodecs._

  implicit val GetOrdersResponseCodecJson: CodecJson[GetOrdersResponse] = CodecJson.derive[GetOrdersResponse]
  implicit val GetOrdersResponseDecoder: EntityDecoder[GetOrdersResponse] = jsonOf[GetOrdersResponse]
  implicit val GetOrdersResponseEncoder: EntityEncoder[GetOrdersResponse] = jsonEncoderOf[GetOrdersResponse]
}

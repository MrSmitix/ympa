package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetOrdersStatsResponse._

case class GetOrdersStatsResponse (
  status: Option[ApiResponseStatusType],
result: Option[OrdersStatsDTO])

object GetOrdersStatsResponse {
  import DateTimeCodecs._

  implicit val GetOrdersStatsResponseCodecJson: CodecJson[GetOrdersStatsResponse] = CodecJson.derive[GetOrdersStatsResponse]
  implicit val GetOrdersStatsResponseDecoder: EntityDecoder[GetOrdersStatsResponse] = jsonOf[GetOrdersStatsResponse]
  implicit val GetOrdersStatsResponseEncoder: EntityEncoder[GetOrdersStatsResponse] = jsonEncoderOf[GetOrdersStatsResponse]
}

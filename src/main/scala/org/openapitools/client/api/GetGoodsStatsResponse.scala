package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetGoodsStatsResponse._

case class GetGoodsStatsResponse (
  status: Option[ApiResponseStatusType],
result: Option[GoodsStatsDTO])

object GetGoodsStatsResponse {
  import DateTimeCodecs._

  implicit val GetGoodsStatsResponseCodecJson: CodecJson[GetGoodsStatsResponse] = CodecJson.derive[GetGoodsStatsResponse]
  implicit val GetGoodsStatsResponseDecoder: EntityDecoder[GetGoodsStatsResponse] = jsonOf[GetGoodsStatsResponse]
  implicit val GetGoodsStatsResponseEncoder: EntityEncoder[GetGoodsStatsResponse] = jsonEncoderOf[GetGoodsStatsResponse]
}

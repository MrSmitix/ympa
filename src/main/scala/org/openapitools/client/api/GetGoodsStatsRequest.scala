package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetGoodsStatsRequest._

case class GetGoodsStatsRequest (
  /* Список ваших идентификаторов SKU.  */
  shopSkus: Set[String])

object GetGoodsStatsRequest {
  import DateTimeCodecs._

  implicit val GetGoodsStatsRequestCodecJson: CodecJson[GetGoodsStatsRequest] = CodecJson.derive[GetGoodsStatsRequest]
  implicit val GetGoodsStatsRequestDecoder: EntityDecoder[GetGoodsStatsRequest] = jsonOf[GetGoodsStatsRequest]
  implicit val GetGoodsStatsRequestEncoder: EntityEncoder[GetGoodsStatsRequest] = jsonEncoderOf[GetGoodsStatsRequest]
}

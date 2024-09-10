package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetPricesByOfferIdsRequest._

case class GetPricesByOfferIdsRequest (
  /* Список SKU.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}     */
  offerIds: Option[List[String]])

object GetPricesByOfferIdsRequest {
  import DateTimeCodecs._

  implicit val GetPricesByOfferIdsRequestCodecJson: CodecJson[GetPricesByOfferIdsRequest] = CodecJson.derive[GetPricesByOfferIdsRequest]
  implicit val GetPricesByOfferIdsRequestDecoder: EntityDecoder[GetPricesByOfferIdsRequest] = jsonOf[GetPricesByOfferIdsRequest]
  implicit val GetPricesByOfferIdsRequestEncoder: EntityEncoder[GetPricesByOfferIdsRequest] = jsonEncoderOf[GetPricesByOfferIdsRequest]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BidRecommendationItemDTO._

case class BidRecommendationItemDTO (
  /* Значение ставки. */
  bid: Integer,
/* Доля показов.  */
  showPercent: Long)

object BidRecommendationItemDTO {
  import DateTimeCodecs._

  implicit val BidRecommendationItemDTOCodecJson: CodecJson[BidRecommendationItemDTO] = CodecJson.derive[BidRecommendationItemDTO]
  implicit val BidRecommendationItemDTODecoder: EntityDecoder[BidRecommendationItemDTO] = jsonOf[BidRecommendationItemDTO]
  implicit val BidRecommendationItemDTOEncoder: EntityEncoder[BidRecommendationItemDTO] = jsonEncoderOf[BidRecommendationItemDTO]
}

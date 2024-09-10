package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferCardRecommendationDTO._

case class OfferCardRecommendationDTO (
  `type`: OfferCardRecommendationType,
/* Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов. */
  percent: Option[Integer])

object OfferCardRecommendationDTO {
  import DateTimeCodecs._

  implicit val OfferCardRecommendationDTOCodecJson: CodecJson[OfferCardRecommendationDTO] = CodecJson.derive[OfferCardRecommendationDTO]
  implicit val OfferCardRecommendationDTODecoder: EntityDecoder[OfferCardRecommendationDTO] = jsonOf[OfferCardRecommendationDTO]
  implicit val OfferCardRecommendationDTOEncoder: EntityEncoder[OfferCardRecommendationDTO] = jsonEncoderOf[OfferCardRecommendationDTO]
}

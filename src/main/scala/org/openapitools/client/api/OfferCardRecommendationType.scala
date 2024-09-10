package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferCardRecommendationType._

case class OfferCardRecommendationType (
  
object OfferCardRecommendationType {
  import DateTimeCodecs._

  implicit val OfferCardRecommendationTypeCodecJson: CodecJson[OfferCardRecommendationType] = CodecJson.derive[OfferCardRecommendationType]
  implicit val OfferCardRecommendationTypeDecoder: EntityDecoder[OfferCardRecommendationType] = jsonOf[OfferCardRecommendationType]
  implicit val OfferCardRecommendationTypeEncoder: EntityEncoder[OfferCardRecommendationType] = jsonEncoderOf[OfferCardRecommendationType]
}

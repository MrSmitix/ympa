package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetSuggestedOfferMappingsRequest._

case class GetSuggestedOfferMappingsRequest (
  /* Список товаров. */
  offers: Option[List[SuggestedOfferDTO]])

object GetSuggestedOfferMappingsRequest {
  import DateTimeCodecs._

  implicit val GetSuggestedOfferMappingsRequestCodecJson: CodecJson[GetSuggestedOfferMappingsRequest] = CodecJson.derive[GetSuggestedOfferMappingsRequest]
  implicit val GetSuggestedOfferMappingsRequestDecoder: EntityDecoder[GetSuggestedOfferMappingsRequest] = jsonOf[GetSuggestedOfferMappingsRequest]
  implicit val GetSuggestedOfferMappingsRequestEncoder: EntityEncoder[GetSuggestedOfferMappingsRequest] = jsonEncoderOf[GetSuggestedOfferMappingsRequest]
}

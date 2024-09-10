package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetSuggestedOfferMappingsResultDTO._

case class GetSuggestedOfferMappingsResultDTO (
  /* Список товаров. */
  offers: List[SuggestedOfferMappingDTO])

object GetSuggestedOfferMappingsResultDTO {
  import DateTimeCodecs._

  implicit val GetSuggestedOfferMappingsResultDTOCodecJson: CodecJson[GetSuggestedOfferMappingsResultDTO] = CodecJson.derive[GetSuggestedOfferMappingsResultDTO]
  implicit val GetSuggestedOfferMappingsResultDTODecoder: EntityDecoder[GetSuggestedOfferMappingsResultDTO] = jsonOf[GetSuggestedOfferMappingsResultDTO]
  implicit val GetSuggestedOfferMappingsResultDTOEncoder: EntityEncoder[GetSuggestedOfferMappingsResultDTO] = jsonEncoderOf[GetSuggestedOfferMappingsResultDTO]
}

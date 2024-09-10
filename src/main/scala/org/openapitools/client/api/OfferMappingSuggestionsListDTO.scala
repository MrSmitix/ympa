package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferMappingSuggestionsListDTO._

case class OfferMappingSuggestionsListDTO (
  /* Список товаров. */
  offers: List[EnrichedMappingsOfferDTO])

object OfferMappingSuggestionsListDTO {
  import DateTimeCodecs._

  implicit val OfferMappingSuggestionsListDTOCodecJson: CodecJson[OfferMappingSuggestionsListDTO] = CodecJson.derive[OfferMappingSuggestionsListDTO]
  implicit val OfferMappingSuggestionsListDTODecoder: EntityDecoder[OfferMappingSuggestionsListDTO] = jsonOf[OfferMappingSuggestionsListDTO]
  implicit val OfferMappingSuggestionsListDTOEncoder: EntityEncoder[OfferMappingSuggestionsListDTO] = jsonEncoderOf[OfferMappingSuggestionsListDTO]
}

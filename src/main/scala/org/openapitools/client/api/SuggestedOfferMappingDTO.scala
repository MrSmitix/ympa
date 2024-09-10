package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SuggestedOfferMappingDTO._

case class SuggestedOfferMappingDTO (
  offer: Option[SuggestedOfferDTO],
mapping: Option[GetMappingDTO])

object SuggestedOfferMappingDTO {
  import DateTimeCodecs._

  implicit val SuggestedOfferMappingDTOCodecJson: CodecJson[SuggestedOfferMappingDTO] = CodecJson.derive[SuggestedOfferMappingDTO]
  implicit val SuggestedOfferMappingDTODecoder: EntityDecoder[SuggestedOfferMappingDTO] = jsonOf[SuggestedOfferMappingDTO]
  implicit val SuggestedOfferMappingDTOEncoder: EntityEncoder[SuggestedOfferMappingDTO] = jsonEncoderOf[SuggestedOfferMappingDTO]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferMappingEntryDTO._

case class OfferMappingEntryDTO (
  mapping: Option[OfferMappingDTO],
awaitingModerationMapping: Option[OfferMappingDTO],
rejectedMapping: Option[OfferMappingDTO],
offer: Option[MappingsOfferDTO])

object OfferMappingEntryDTO {
  import DateTimeCodecs._

  implicit val OfferMappingEntryDTOCodecJson: CodecJson[OfferMappingEntryDTO] = CodecJson.derive[OfferMappingEntryDTO]
  implicit val OfferMappingEntryDTODecoder: EntityDecoder[OfferMappingEntryDTO] = jsonOf[OfferMappingEntryDTO]
  implicit val OfferMappingEntryDTOEncoder: EntityEncoder[OfferMappingEntryDTO] = jsonEncoderOf[OfferMappingEntryDTO]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferMappingEntriesDTO._

case class OfferMappingEntriesDTO (
  paging: Option[ScrollingPagerDTO],
/* Информация о товарах в каталоге. */
  offerMappingEntries: List[OfferMappingEntryDTO])

object OfferMappingEntriesDTO {
  import DateTimeCodecs._

  implicit val OfferMappingEntriesDTOCodecJson: CodecJson[OfferMappingEntriesDTO] = CodecJson.derive[OfferMappingEntriesDTO]
  implicit val OfferMappingEntriesDTODecoder: EntityDecoder[OfferMappingEntriesDTO] = jsonOf[OfferMappingEntriesDTO]
  implicit val OfferMappingEntriesDTOEncoder: EntityEncoder[OfferMappingEntriesDTO] = jsonEncoderOf[OfferMappingEntriesDTO]
}

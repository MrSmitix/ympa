package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateOfferMappingEntryRequest._

case class UpdateOfferMappingEntryRequest (
  /* Информация о товарах в каталоге. */
  offerMappingEntries: List[UpdateOfferMappingEntryDTO])

object UpdateOfferMappingEntryRequest {
  import DateTimeCodecs._

  implicit val UpdateOfferMappingEntryRequestCodecJson: CodecJson[UpdateOfferMappingEntryRequest] = CodecJson.derive[UpdateOfferMappingEntryRequest]
  implicit val UpdateOfferMappingEntryRequestDecoder: EntityDecoder[UpdateOfferMappingEntryRequest] = jsonOf[UpdateOfferMappingEntryRequest]
  implicit val UpdateOfferMappingEntryRequestEncoder: EntityEncoder[UpdateOfferMappingEntryRequest] = jsonEncoderOf[UpdateOfferMappingEntryRequest]
}

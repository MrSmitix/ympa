package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateOfferMappingDTO._

case class UpdateOfferMappingDTO (
  offer: UpdateOfferDTO,
mapping: Option[UpdateMappingDTO])

object UpdateOfferMappingDTO {
  import DateTimeCodecs._

  implicit val UpdateOfferMappingDTOCodecJson: CodecJson[UpdateOfferMappingDTO] = CodecJson.derive[UpdateOfferMappingDTO]
  implicit val UpdateOfferMappingDTODecoder: EntityDecoder[UpdateOfferMappingDTO] = jsonOf[UpdateOfferMappingDTO]
  implicit val UpdateOfferMappingDTOEncoder: EntityEncoder[UpdateOfferMappingDTO] = jsonEncoderOf[UpdateOfferMappingDTO]
}

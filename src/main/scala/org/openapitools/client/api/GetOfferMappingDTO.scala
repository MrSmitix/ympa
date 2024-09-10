package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetOfferMappingDTO._

case class GetOfferMappingDTO (
  offer: Option[GetOfferDTO],
mapping: Option[GetMappingDTO])

object GetOfferMappingDTO {
  import DateTimeCodecs._

  implicit val GetOfferMappingDTOCodecJson: CodecJson[GetOfferMappingDTO] = CodecJson.derive[GetOfferMappingDTO]
  implicit val GetOfferMappingDTODecoder: EntityDecoder[GetOfferMappingDTO] = jsonOf[GetOfferMappingDTO]
  implicit val GetOfferMappingDTOEncoder: EntityEncoder[GetOfferMappingDTO] = jsonEncoderOf[GetOfferMappingDTO]
}

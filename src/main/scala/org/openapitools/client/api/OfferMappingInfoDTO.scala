package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferMappingInfoDTO._

case class OfferMappingInfoDTO (
  mapping: Option[OfferMappingDTO],
awaitingModerationMapping: Option[OfferMappingDTO],
rejectedMapping: Option[OfferMappingDTO])

object OfferMappingInfoDTO {
  import DateTimeCodecs._

  implicit val OfferMappingInfoDTOCodecJson: CodecJson[OfferMappingInfoDTO] = CodecJson.derive[OfferMappingInfoDTO]
  implicit val OfferMappingInfoDTODecoder: EntityDecoder[OfferMappingInfoDTO] = jsonOf[OfferMappingInfoDTO]
  implicit val OfferMappingInfoDTOEncoder: EntityEncoder[OfferMappingInfoDTO] = jsonEncoderOf[OfferMappingInfoDTO]
}

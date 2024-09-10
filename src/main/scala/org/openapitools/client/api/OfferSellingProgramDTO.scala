package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferSellingProgramDTO._

case class OfferSellingProgramDTO (
  sellingProgram: SellingProgramType,
status: OfferSellingProgramStatusType)

object OfferSellingProgramDTO {
  import DateTimeCodecs._

  implicit val OfferSellingProgramDTOCodecJson: CodecJson[OfferSellingProgramDTO] = CodecJson.derive[OfferSellingProgramDTO]
  implicit val OfferSellingProgramDTODecoder: EntityDecoder[OfferSellingProgramDTO] = jsonOf[OfferSellingProgramDTO]
  implicit val OfferSellingProgramDTOEncoder: EntityEncoder[OfferSellingProgramDTO] = jsonEncoderOf[OfferSellingProgramDTO]
}

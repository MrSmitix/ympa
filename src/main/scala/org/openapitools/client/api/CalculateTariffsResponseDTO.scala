package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CalculateTariffsResponseDTO._

case class CalculateTariffsResponseDTO (
  /* Стоимость услуг. */
  offers: List[CalculateTariffsOfferInfoDTO])

object CalculateTariffsResponseDTO {
  import DateTimeCodecs._

  implicit val CalculateTariffsResponseDTOCodecJson: CodecJson[CalculateTariffsResponseDTO] = CodecJson.derive[CalculateTariffsResponseDTO]
  implicit val CalculateTariffsResponseDTODecoder: EntityDecoder[CalculateTariffsResponseDTO] = jsonOf[CalculateTariffsResponseDTO]
  implicit val CalculateTariffsResponseDTOEncoder: EntityEncoder[CalculateTariffsResponseDTO] = jsonEncoderOf[CalculateTariffsResponseDTO]
}

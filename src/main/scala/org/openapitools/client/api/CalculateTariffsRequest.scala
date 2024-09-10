package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CalculateTariffsRequest._

case class CalculateTariffsRequest (
  parameters: CalculateTariffsParametersDTO,
/* Товары, для которых нужно рассчитать стоимость услуг. */
  offers: List[CalculateTariffsOfferDTO])

object CalculateTariffsRequest {
  import DateTimeCodecs._

  implicit val CalculateTariffsRequestCodecJson: CodecJson[CalculateTariffsRequest] = CodecJson.derive[CalculateTariffsRequest]
  implicit val CalculateTariffsRequestDecoder: EntityDecoder[CalculateTariffsRequest] = jsonOf[CalculateTariffsRequest]
  implicit val CalculateTariffsRequestEncoder: EntityEncoder[CalculateTariffsRequest] = jsonEncoderOf[CalculateTariffsRequest]
}

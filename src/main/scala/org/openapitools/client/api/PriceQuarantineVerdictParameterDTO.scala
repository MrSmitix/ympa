package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PriceQuarantineVerdictParameterDTO._

case class PriceQuarantineVerdictParameterDTO (
  name: PriceQuarantineVerdictParamNameType,
/* Значение параметра. */
  value: String)

object PriceQuarantineVerdictParameterDTO {
  import DateTimeCodecs._

  implicit val PriceQuarantineVerdictParameterDTOCodecJson: CodecJson[PriceQuarantineVerdictParameterDTO] = CodecJson.derive[PriceQuarantineVerdictParameterDTO]
  implicit val PriceQuarantineVerdictParameterDTODecoder: EntityDecoder[PriceQuarantineVerdictParameterDTO] = jsonOf[PriceQuarantineVerdictParameterDTO]
  implicit val PriceQuarantineVerdictParameterDTOEncoder: EntityEncoder[PriceQuarantineVerdictParameterDTO] = jsonEncoderOf[PriceQuarantineVerdictParameterDTO]
}

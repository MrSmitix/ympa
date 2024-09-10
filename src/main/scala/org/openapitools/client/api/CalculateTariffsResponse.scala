package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CalculateTariffsResponse._

case class CalculateTariffsResponse (
  status: Option[ApiResponseStatusType],
result: Option[CalculateTariffsResponseDTO])

object CalculateTariffsResponse {
  import DateTimeCodecs._

  implicit val CalculateTariffsResponseCodecJson: CodecJson[CalculateTariffsResponse] = CodecJson.derive[CalculateTariffsResponse]
  implicit val CalculateTariffsResponseDecoder: EntityDecoder[CalculateTariffsResponse] = jsonOf[CalculateTariffsResponse]
  implicit val CalculateTariffsResponseEncoder: EntityEncoder[CalculateTariffsResponse] = jsonEncoderOf[CalculateTariffsResponse]
}

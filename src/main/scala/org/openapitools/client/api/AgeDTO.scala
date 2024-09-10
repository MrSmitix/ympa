package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AgeDTO._

case class AgeDTO (
  /* Значение.  */
  value: BigDecimal,
ageUnit: AgeUnitType)

object AgeDTO {
  import DateTimeCodecs._

  implicit val AgeDTOCodecJson: CodecJson[AgeDTO] = CodecJson.derive[AgeDTO]
  implicit val AgeDTODecoder: EntityDecoder[AgeDTO] = jsonOf[AgeDTO]
  implicit val AgeDTOEncoder: EntityEncoder[AgeDTO] = jsonEncoderOf[AgeDTO]
}

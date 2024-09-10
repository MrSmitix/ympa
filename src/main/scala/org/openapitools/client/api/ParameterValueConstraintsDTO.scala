package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ParameterValueConstraintsDTO._

case class ParameterValueConstraintsDTO (
  /* Минимальное число. */
  minValue: Option[Double],
/* Максимальное число. */
  maxValue: Option[Double],
/* Максимальная длина текста. */
  maxLength: Option[Integer])

object ParameterValueConstraintsDTO {
  import DateTimeCodecs._

  implicit val ParameterValueConstraintsDTOCodecJson: CodecJson[ParameterValueConstraintsDTO] = CodecJson.derive[ParameterValueConstraintsDTO]
  implicit val ParameterValueConstraintsDTODecoder: EntityDecoder[ParameterValueConstraintsDTO] = jsonOf[ParameterValueConstraintsDTO]
  implicit val ParameterValueConstraintsDTOEncoder: EntityEncoder[ParameterValueConstraintsDTO] = jsonEncoderOf[ParameterValueConstraintsDTO]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ParameterValueOptionDTO._

case class ParameterValueOptionDTO (
  /* Идентификатор значения. */
  id: Long,
/* Значение. */
  value: String,
/* Описание значения. */
  description: Option[String])

object ParameterValueOptionDTO {
  import DateTimeCodecs._

  implicit val ParameterValueOptionDTOCodecJson: CodecJson[ParameterValueOptionDTO] = CodecJson.derive[ParameterValueOptionDTO]
  implicit val ParameterValueOptionDTODecoder: EntityDecoder[ParameterValueOptionDTO] = jsonOf[ParameterValueOptionDTO]
  implicit val ParameterValueOptionDTOEncoder: EntityEncoder[ParameterValueOptionDTO] = jsonEncoderOf[ParameterValueOptionDTO]
}

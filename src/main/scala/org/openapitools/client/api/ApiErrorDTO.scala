package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ApiErrorDTO._

case class ApiErrorDTO (
  /* Код ошибки. */
  code: String,
/* Описание ошибки. */
  message: Option[String])

object ApiErrorDTO {
  import DateTimeCodecs._

  implicit val ApiErrorDTOCodecJson: CodecJson[ApiErrorDTO] = CodecJson.derive[ApiErrorDTO]
  implicit val ApiErrorDTODecoder: EntityDecoder[ApiErrorDTO] = jsonOf[ApiErrorDTO]
  implicit val ApiErrorDTOEncoder: EntityEncoder[ApiErrorDTO] = jsonEncoderOf[ApiErrorDTO]
}

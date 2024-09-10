package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ApiUnauthorizedErrorResponse._

case class ApiUnauthorizedErrorResponse (
  status: Option[ApiResponseStatusType],
/* Список ошибок. */
  errors: Option[List[ApiErrorDTO]])

object ApiUnauthorizedErrorResponse {
  import DateTimeCodecs._

  implicit val ApiUnauthorizedErrorResponseCodecJson: CodecJson[ApiUnauthorizedErrorResponse] = CodecJson.derive[ApiUnauthorizedErrorResponse]
  implicit val ApiUnauthorizedErrorResponseDecoder: EntityDecoder[ApiUnauthorizedErrorResponse] = jsonOf[ApiUnauthorizedErrorResponse]
  implicit val ApiUnauthorizedErrorResponseEncoder: EntityEncoder[ApiUnauthorizedErrorResponse] = jsonEncoderOf[ApiUnauthorizedErrorResponse]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ApiLockedErrorResponse._

case class ApiLockedErrorResponse (
  status: Option[ApiResponseStatusType],
/* Список ошибок. */
  errors: Option[List[ApiErrorDTO]])

object ApiLockedErrorResponse {
  import DateTimeCodecs._

  implicit val ApiLockedErrorResponseCodecJson: CodecJson[ApiLockedErrorResponse] = CodecJson.derive[ApiLockedErrorResponse]
  implicit val ApiLockedErrorResponseDecoder: EntityDecoder[ApiLockedErrorResponse] = jsonOf[ApiLockedErrorResponse]
  implicit val ApiLockedErrorResponseEncoder: EntityEncoder[ApiLockedErrorResponse] = jsonEncoderOf[ApiLockedErrorResponse]
}

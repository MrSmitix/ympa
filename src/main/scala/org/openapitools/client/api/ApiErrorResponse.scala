package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ApiErrorResponse._

case class ApiErrorResponse (
  status: Option[ApiResponseStatusType],
/* Список ошибок. */
  errors: Option[List[ApiErrorDTO]])

object ApiErrorResponse {
  import DateTimeCodecs._

  implicit val ApiErrorResponseCodecJson: CodecJson[ApiErrorResponse] = CodecJson.derive[ApiErrorResponse]
  implicit val ApiErrorResponseDecoder: EntityDecoder[ApiErrorResponse] = jsonOf[ApiErrorResponse]
  implicit val ApiErrorResponseEncoder: EntityEncoder[ApiErrorResponse] = jsonEncoderOf[ApiErrorResponse]
}

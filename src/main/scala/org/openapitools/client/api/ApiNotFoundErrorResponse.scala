package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ApiNotFoundErrorResponse._

case class ApiNotFoundErrorResponse (
  status: Option[ApiResponseStatusType],
/* Список ошибок. */
  errors: Option[List[ApiErrorDTO]])

object ApiNotFoundErrorResponse {
  import DateTimeCodecs._

  implicit val ApiNotFoundErrorResponseCodecJson: CodecJson[ApiNotFoundErrorResponse] = CodecJson.derive[ApiNotFoundErrorResponse]
  implicit val ApiNotFoundErrorResponseDecoder: EntityDecoder[ApiNotFoundErrorResponse] = jsonOf[ApiNotFoundErrorResponse]
  implicit val ApiNotFoundErrorResponseEncoder: EntityEncoder[ApiNotFoundErrorResponse] = jsonEncoderOf[ApiNotFoundErrorResponse]
}

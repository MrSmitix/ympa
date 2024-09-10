package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ApiServerErrorResponse._

case class ApiServerErrorResponse (
  status: Option[ApiResponseStatusType],
/* Список ошибок. */
  errors: Option[List[ApiErrorDTO]])

object ApiServerErrorResponse {
  import DateTimeCodecs._

  implicit val ApiServerErrorResponseCodecJson: CodecJson[ApiServerErrorResponse] = CodecJson.derive[ApiServerErrorResponse]
  implicit val ApiServerErrorResponseDecoder: EntityDecoder[ApiServerErrorResponse] = jsonOf[ApiServerErrorResponse]
  implicit val ApiServerErrorResponseEncoder: EntityEncoder[ApiServerErrorResponse] = jsonEncoderOf[ApiServerErrorResponse]
}

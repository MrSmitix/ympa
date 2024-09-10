package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ApiClientDataErrorResponse._

case class ApiClientDataErrorResponse (
  status: Option[ApiResponseStatusType],
/* Список ошибок. */
  errors: Option[List[ApiErrorDTO]])

object ApiClientDataErrorResponse {
  import DateTimeCodecs._

  implicit val ApiClientDataErrorResponseCodecJson: CodecJson[ApiClientDataErrorResponse] = CodecJson.derive[ApiClientDataErrorResponse]
  implicit val ApiClientDataErrorResponseDecoder: EntityDecoder[ApiClientDataErrorResponse] = jsonOf[ApiClientDataErrorResponse]
  implicit val ApiClientDataErrorResponseEncoder: EntityEncoder[ApiClientDataErrorResponse] = jsonEncoderOf[ApiClientDataErrorResponse]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ApiForbiddenErrorResponse._

case class ApiForbiddenErrorResponse (
  status: Option[ApiResponseStatusType],
/* Список ошибок. */
  errors: Option[List[ApiErrorDTO]])

object ApiForbiddenErrorResponse {
  import DateTimeCodecs._

  implicit val ApiForbiddenErrorResponseCodecJson: CodecJson[ApiForbiddenErrorResponse] = CodecJson.derive[ApiForbiddenErrorResponse]
  implicit val ApiForbiddenErrorResponseDecoder: EntityDecoder[ApiForbiddenErrorResponse] = jsonOf[ApiForbiddenErrorResponse]
  implicit val ApiForbiddenErrorResponseEncoder: EntityEncoder[ApiForbiddenErrorResponse] = jsonEncoderOf[ApiForbiddenErrorResponse]
}

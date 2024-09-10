package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ApiLimitErrorResponse._

case class ApiLimitErrorResponse (
  status: Option[ApiResponseStatusType],
/* Список ошибок. */
  errors: Option[List[ApiErrorDTO]])

object ApiLimitErrorResponse {
  import DateTimeCodecs._

  implicit val ApiLimitErrorResponseCodecJson: CodecJson[ApiLimitErrorResponse] = CodecJson.derive[ApiLimitErrorResponse]
  implicit val ApiLimitErrorResponseDecoder: EntityDecoder[ApiLimitErrorResponse] = jsonOf[ApiLimitErrorResponse]
  implicit val ApiLimitErrorResponseEncoder: EntityEncoder[ApiLimitErrorResponse] = jsonEncoderOf[ApiLimitErrorResponse]
}

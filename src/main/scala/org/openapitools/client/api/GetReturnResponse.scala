package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetReturnResponse._

case class GetReturnResponse (
  status: Option[ApiResponseStatusType],
result: Option[ReturnDTO])

object GetReturnResponse {
  import DateTimeCodecs._

  implicit val GetReturnResponseCodecJson: CodecJson[GetReturnResponse] = CodecJson.derive[GetReturnResponse]
  implicit val GetReturnResponseDecoder: EntityDecoder[GetReturnResponse] = jsonOf[GetReturnResponse]
  implicit val GetReturnResponseEncoder: EntityEncoder[GetReturnResponse] = jsonEncoderOf[GetReturnResponse]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EmptyApiResponse._

case class EmptyApiResponse (
  status: Option[ApiResponseStatusType])

object EmptyApiResponse {
  import DateTimeCodecs._

  implicit val EmptyApiResponseCodecJson: CodecJson[EmptyApiResponse] = CodecJson.derive[EmptyApiResponse]
  implicit val EmptyApiResponseDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]
  implicit val EmptyApiResponseEncoder: EntityEncoder[EmptyApiResponse] = jsonEncoderOf[EmptyApiResponse]
}

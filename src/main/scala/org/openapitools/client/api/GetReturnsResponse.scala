package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetReturnsResponse._

case class GetReturnsResponse (
  status: Option[ApiResponseStatusType],
result: Option[PagedReturnsDTO])

object GetReturnsResponse {
  import DateTimeCodecs._

  implicit val GetReturnsResponseCodecJson: CodecJson[GetReturnsResponse] = CodecJson.derive[GetReturnsResponse]
  implicit val GetReturnsResponseDecoder: EntityDecoder[GetReturnsResponse] = jsonOf[GetReturnsResponse]
  implicit val GetReturnsResponseEncoder: EntityEncoder[GetReturnsResponse] = jsonEncoderOf[GetReturnsResponse]
}

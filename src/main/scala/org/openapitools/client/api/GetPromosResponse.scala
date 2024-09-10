package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetPromosResponse._

case class GetPromosResponse (
  status: Option[ApiResponseStatusType],
result: Option[GetPromosResultDTO])

object GetPromosResponse {
  import DateTimeCodecs._

  implicit val GetPromosResponseCodecJson: CodecJson[GetPromosResponse] = CodecJson.derive[GetPromosResponse]
  implicit val GetPromosResponseDecoder: EntityDecoder[GetPromosResponse] = jsonOf[GetPromosResponse]
  implicit val GetPromosResponseEncoder: EntityEncoder[GetPromosResponse] = jsonEncoderOf[GetPromosResponse]
}

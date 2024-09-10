package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetBidsInfoResponse._

case class GetBidsInfoResponse (
  status: Option[ApiResponseStatusType],
result: Option[GetBidsInfoResponseDTO])

object GetBidsInfoResponse {
  import DateTimeCodecs._

  implicit val GetBidsInfoResponseCodecJson: CodecJson[GetBidsInfoResponse] = CodecJson.derive[GetBidsInfoResponse]
  implicit val GetBidsInfoResponseDecoder: EntityDecoder[GetBidsInfoResponse] = jsonOf[GetBidsInfoResponse]
  implicit val GetBidsInfoResponseEncoder: EntityEncoder[GetBidsInfoResponse] = jsonEncoderOf[GetBidsInfoResponse]
}

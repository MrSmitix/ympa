package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetChatsResponse._

case class GetChatsResponse (
  status: Option[ApiResponseStatusType],
result: Option[GetChatsInfoDTO])

object GetChatsResponse {
  import DateTimeCodecs._

  implicit val GetChatsResponseCodecJson: CodecJson[GetChatsResponse] = CodecJson.derive[GetChatsResponse]
  implicit val GetChatsResponseDecoder: EntityDecoder[GetChatsResponse] = jsonOf[GetChatsResponse]
  implicit val GetChatsResponseEncoder: EntityEncoder[GetChatsResponse] = jsonEncoderOf[GetChatsResponse]
}

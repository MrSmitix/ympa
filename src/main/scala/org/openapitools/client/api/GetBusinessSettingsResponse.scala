package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetBusinessSettingsResponse._

case class GetBusinessSettingsResponse (
  status: Option[ApiResponseStatusType],
result: Option[GetBusinessSettingsInfoDTO])

object GetBusinessSettingsResponse {
  import DateTimeCodecs._

  implicit val GetBusinessSettingsResponseCodecJson: CodecJson[GetBusinessSettingsResponse] = CodecJson.derive[GetBusinessSettingsResponse]
  implicit val GetBusinessSettingsResponseDecoder: EntityDecoder[GetBusinessSettingsResponse] = jsonOf[GetBusinessSettingsResponse]
  implicit val GetBusinessSettingsResponseEncoder: EntityEncoder[GetBusinessSettingsResponse] = jsonEncoderOf[GetBusinessSettingsResponse]
}

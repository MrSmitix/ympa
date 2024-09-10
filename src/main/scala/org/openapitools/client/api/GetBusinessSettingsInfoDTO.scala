package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetBusinessSettingsInfoDTO._

case class GetBusinessSettingsInfoDTO (
  info: Option[BusinessDTO],
settings: Option[BusinessSettingsDTO])

object GetBusinessSettingsInfoDTO {
  import DateTimeCodecs._

  implicit val GetBusinessSettingsInfoDTOCodecJson: CodecJson[GetBusinessSettingsInfoDTO] = CodecJson.derive[GetBusinessSettingsInfoDTO]
  implicit val GetBusinessSettingsInfoDTODecoder: EntityDecoder[GetBusinessSettingsInfoDTO] = jsonOf[GetBusinessSettingsInfoDTO]
  implicit val GetBusinessSettingsInfoDTOEncoder: EntityEncoder[GetBusinessSettingsInfoDTO] = jsonEncoderOf[GetBusinessSettingsInfoDTO]
}

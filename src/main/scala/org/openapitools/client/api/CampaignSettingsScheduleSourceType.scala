package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignSettingsScheduleSourceType._

case class CampaignSettingsScheduleSourceType (
  
object CampaignSettingsScheduleSourceType {
  import DateTimeCodecs._

  implicit val CampaignSettingsScheduleSourceTypeCodecJson: CodecJson[CampaignSettingsScheduleSourceType] = CodecJson.derive[CampaignSettingsScheduleSourceType]
  implicit val CampaignSettingsScheduleSourceTypeDecoder: EntityDecoder[CampaignSettingsScheduleSourceType] = jsonOf[CampaignSettingsScheduleSourceType]
  implicit val CampaignSettingsScheduleSourceTypeEncoder: EntityEncoder[CampaignSettingsScheduleSourceType] = jsonEncoderOf[CampaignSettingsScheduleSourceType]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignSettingsTimePeriodDTO._

case class CampaignSettingsTimePeriodDTO (
  /* Формат даты: `ДД-ММ-ГГГГ`.  */
  fromDate: Option[String],
/* Формат даты: `ДД-ММ-ГГГГ`.  */
  toDate: Option[String])

object CampaignSettingsTimePeriodDTO {
  import DateTimeCodecs._

  implicit val CampaignSettingsTimePeriodDTOCodecJson: CodecJson[CampaignSettingsTimePeriodDTO] = CodecJson.derive[CampaignSettingsTimePeriodDTO]
  implicit val CampaignSettingsTimePeriodDTODecoder: EntityDecoder[CampaignSettingsTimePeriodDTO] = jsonOf[CampaignSettingsTimePeriodDTO]
  implicit val CampaignSettingsTimePeriodDTOEncoder: EntityEncoder[CampaignSettingsTimePeriodDTO] = jsonEncoderOf[CampaignSettingsTimePeriodDTO]
}

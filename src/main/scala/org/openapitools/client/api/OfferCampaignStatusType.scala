package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferCampaignStatusType._

case class OfferCampaignStatusType (
  
object OfferCampaignStatusType {
  import DateTimeCodecs._

  implicit val OfferCampaignStatusTypeCodecJson: CodecJson[OfferCampaignStatusType] = CodecJson.derive[OfferCampaignStatusType]
  implicit val OfferCampaignStatusTypeDecoder: EntityDecoder[OfferCampaignStatusType] = jsonOf[OfferCampaignStatusType]
  implicit val OfferCampaignStatusTypeEncoder: EntityEncoder[OfferCampaignStatusType] = jsonEncoderOf[OfferCampaignStatusType]
}

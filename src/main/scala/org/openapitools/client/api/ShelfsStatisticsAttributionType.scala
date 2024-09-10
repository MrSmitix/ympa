package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ShelfsStatisticsAttributionType._

case class ShelfsStatisticsAttributionType (
  
object ShelfsStatisticsAttributionType {
  import DateTimeCodecs._

  implicit val ShelfsStatisticsAttributionTypeCodecJson: CodecJson[ShelfsStatisticsAttributionType] = CodecJson.derive[ShelfsStatisticsAttributionType]
  implicit val ShelfsStatisticsAttributionTypeDecoder: EntityDecoder[ShelfsStatisticsAttributionType] = jsonOf[ShelfsStatisticsAttributionType]
  implicit val ShelfsStatisticsAttributionTypeEncoder: EntityEncoder[ShelfsStatisticsAttributionType] = jsonEncoderOf[ShelfsStatisticsAttributionType]
}

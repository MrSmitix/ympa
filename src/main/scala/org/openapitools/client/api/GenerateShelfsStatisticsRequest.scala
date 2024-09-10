package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import GenerateShelfsStatisticsRequest._

case class GenerateShelfsStatisticsRequest (
  /* Идентификатор бизнеса. */
  businessId: Long,
/* Начало периода, включительно. */
  dateFrom: LocalDate,
/* Конец периода, включительно. */
  dateTo: LocalDate,
attributionType: ShelfsStatisticsAttributionType)

object GenerateShelfsStatisticsRequest {
  import DateTimeCodecs._

  implicit val GenerateShelfsStatisticsRequestCodecJson: CodecJson[GenerateShelfsStatisticsRequest] = CodecJson.derive[GenerateShelfsStatisticsRequest]
  implicit val GenerateShelfsStatisticsRequestDecoder: EntityDecoder[GenerateShelfsStatisticsRequest] = jsonOf[GenerateShelfsStatisticsRequest]
  implicit val GenerateShelfsStatisticsRequestEncoder: EntityEncoder[GenerateShelfsStatisticsRequest] = jsonEncoderOf[GenerateShelfsStatisticsRequest]
}

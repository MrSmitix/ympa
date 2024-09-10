package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import GenerateCompetitorsPositionReportRequest._

case class GenerateCompetitorsPositionReportRequest (
  /* Идентификатор бизнеса. */
  businessId: Long,
/* Идентификатор категории. */
  categoryId: Long,
/* Начало периода, включительно. */
  dateFrom: LocalDate,
/* Конец периода, включительно. */
  dateTo: LocalDate)

object GenerateCompetitorsPositionReportRequest {
  import DateTimeCodecs._

  implicit val GenerateCompetitorsPositionReportRequestCodecJson: CodecJson[GenerateCompetitorsPositionReportRequest] = CodecJson.derive[GenerateCompetitorsPositionReportRequest]
  implicit val GenerateCompetitorsPositionReportRequestDecoder: EntityDecoder[GenerateCompetitorsPositionReportRequest] = jsonOf[GenerateCompetitorsPositionReportRequest]
  implicit val GenerateCompetitorsPositionReportRequestEncoder: EntityEncoder[GenerateCompetitorsPositionReportRequest] = jsonEncoderOf[GenerateCompetitorsPositionReportRequest]
}

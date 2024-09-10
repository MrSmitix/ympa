package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import GenerateShowsSalesReportRequest._

case class GenerateShowsSalesReportRequest (
  /* Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу.  */
  businessId: Option[Long],
/* Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу.  */
  campaignId: Option[Long],
/* Начало периода, включительно. */
  dateFrom: LocalDate,
/* Конец периода, включительно. */
  dateTo: LocalDate,
grouping: ShowsSalesGroupingType)

object GenerateShowsSalesReportRequest {
  import DateTimeCodecs._

  implicit val GenerateShowsSalesReportRequestCodecJson: CodecJson[GenerateShowsSalesReportRequest] = CodecJson.derive[GenerateShowsSalesReportRequest]
  implicit val GenerateShowsSalesReportRequestDecoder: EntityDecoder[GenerateShowsSalesReportRequest] = jsonOf[GenerateShowsSalesReportRequest]
  implicit val GenerateShowsSalesReportRequestEncoder: EntityEncoder[GenerateShowsSalesReportRequest] = jsonEncoderOf[GenerateShowsSalesReportRequest]
}

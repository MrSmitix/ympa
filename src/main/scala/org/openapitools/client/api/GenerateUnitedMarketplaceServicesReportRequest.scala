package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate
import java.time.OffsetDateTime

import GenerateUnitedMarketplaceServicesReportRequest._

case class GenerateUnitedMarketplaceServicesReportRequest (
  /* Идентификатор бизнеса. */
  businessId: Long,
/* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  */
  dateTimeFrom: Option[OffsetDateTime],
/* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  */
  dateTimeTo: Option[OffsetDateTime],
/* Начало периода, включительно. */
  dateFrom: Option[LocalDate],
/* Конец периода, включительно. Максимальный период — 1 год. */
  dateTo: Option[LocalDate],
/* Начальный год формирования акта. */
  yearFrom: Option[Integer],
/* Начальный номер месяца формирования акта. */
  monthFrom: Option[Integer],
/* Конечный год формирования акта. */
  yearTo: Option[Integer],
/* Конечный номер месяца формирования акта. */
  monthTo: Option[Integer],
/* Список моделей, которые нужны в отчете.  */
  placementPrograms: Option[List[PlacementType]],
/* Список ИНН, которые нужны в отчете. */
  inns: Option[List[String]],
/* Список магазинов, которые нужны в отчете. */
  campaignIds: Option[List[Long]])

object GenerateUnitedMarketplaceServicesReportRequest {
  import DateTimeCodecs._

  implicit val GenerateUnitedMarketplaceServicesReportRequestCodecJson: CodecJson[GenerateUnitedMarketplaceServicesReportRequest] = CodecJson.derive[GenerateUnitedMarketplaceServicesReportRequest]
  implicit val GenerateUnitedMarketplaceServicesReportRequestDecoder: EntityDecoder[GenerateUnitedMarketplaceServicesReportRequest] = jsonOf[GenerateUnitedMarketplaceServicesReportRequest]
  implicit val GenerateUnitedMarketplaceServicesReportRequestEncoder: EntityEncoder[GenerateUnitedMarketplaceServicesReportRequest] = jsonEncoderOf[GenerateUnitedMarketplaceServicesReportRequest]
}

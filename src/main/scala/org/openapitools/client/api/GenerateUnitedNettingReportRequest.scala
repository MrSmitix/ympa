package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate
import java.time.OffsetDateTime

import GenerateUnitedNettingReportRequest._

case class GenerateUnitedNettingReportRequest (
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
/* Номер платежного поручения. */
  bankOrderId: Option[Long],
/* Дата платежного поручения. */
  bankOrderDateTime: Option[OffsetDateTime],
/* Список моделей, которые нужны в отчете.  */
  placementPrograms: Option[List[PlacementType]],
/* Список ИНН, которые нужны в отчете. */
  inns: Option[List[String]],
/* Список магазинов, которые нужны в отчете. */
  campaignIds: Option[List[Long]])

object GenerateUnitedNettingReportRequest {
  import DateTimeCodecs._

  implicit val GenerateUnitedNettingReportRequestCodecJson: CodecJson[GenerateUnitedNettingReportRequest] = CodecJson.derive[GenerateUnitedNettingReportRequest]
  implicit val GenerateUnitedNettingReportRequestDecoder: EntityDecoder[GenerateUnitedNettingReportRequest] = jsonOf[GenerateUnitedNettingReportRequest]
  implicit val GenerateUnitedNettingReportRequestEncoder: EntityEncoder[GenerateUnitedNettingReportRequest] = jsonEncoderOf[GenerateUnitedNettingReportRequest]
}

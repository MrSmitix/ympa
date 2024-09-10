package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import GeneratePricesReportRequest._

case class GeneratePricesReportRequest (
  /* Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`.  */
  businessId: Option[Long],
/* Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно.  */
  campaignId: Option[Long],
/* Фильтр по категориям на Маркете. */
  categoryIds: Option[List[Long]],
/* Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`.  */
  creationDateFrom: Option[LocalDate],
/* Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`.  */
  creationDateTo: Option[LocalDate])

object GeneratePricesReportRequest {
  import DateTimeCodecs._

  implicit val GeneratePricesReportRequestCodecJson: CodecJson[GeneratePricesReportRequest] = CodecJson.derive[GeneratePricesReportRequest]
  implicit val GeneratePricesReportRequestDecoder: EntityDecoder[GeneratePricesReportRequest] = jsonOf[GeneratePricesReportRequest]
  implicit val GeneratePricesReportRequestEncoder: EntityEncoder[GeneratePricesReportRequest] = jsonEncoderOf[GeneratePricesReportRequest]
}

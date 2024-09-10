package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.LocalDateTime
import java.time.ZonedDateTime
import org.openapitools.models.PlacementType
import scala.collection.immutable.Seq

/**
 * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 * @param businessId Идентификатор бизнеса.
 * @param dateTimeFrom {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
 * @param dateTimeTo {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
 * @param dateFrom Начало периода, включительно.
 * @param dateTo Конец периода, включительно. Максимальный период — 1 год.
 * @param bankOrderId Номер платежного поручения.
 * @param bankOrderDateTime Дата платежного поручения.
 * @param placementPrograms Список моделей, которые нужны в отчете. 
 * @param inns Список ИНН, которые нужны в отчете.
 * @param campaignIds Список магазинов, которые нужны в отчете.
 */
case class GenerateUnitedNettingReportRequest(businessId: Long,
                dateTimeFrom: Option[ZonedDateTime],
                dateTimeTo: Option[ZonedDateTime],
                dateFrom: Option[LocalDateTime],
                dateTo: Option[LocalDateTime],
                bankOrderId: Option[Long],
                bankOrderDateTime: Option[ZonedDateTime],
                placementPrograms: Option[Seq[PlacementType]],
                inns: Option[Seq[String]],
                campaignIds: Option[Seq[Long]]
                )

object GenerateUnitedNettingReportRequest {
    /**
     * Creates the codec for converting GenerateUnitedNettingReportRequest from and to JSON.
     */
    implicit val decoder: Decoder[GenerateUnitedNettingReportRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GenerateUnitedNettingReportRequest] = deriveEncoder
}

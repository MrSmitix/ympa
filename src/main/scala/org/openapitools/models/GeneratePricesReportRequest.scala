package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.LocalDateTime
import scala.collection.immutable.Seq

/**
 * Данные, необходимые для генерации отчета.
 * @param businessId Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. 
 * @param campaignId Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. 
 * @param categoryIds Фильтр по категориям на Маркете.
 * @param creationDateFrom Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. 
 * @param creationDateTo Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. 
 */
case class GeneratePricesReportRequest(businessId: Option[Long],
                campaignId: Option[Long],
                categoryIds: Option[Seq[Long]],
                creationDateFrom: Option[LocalDateTime],
                creationDateTo: Option[LocalDateTime]
                )

object GeneratePricesReportRequest {
    /**
     * Creates the codec for converting GeneratePricesReportRequest from and to JSON.
     */
    implicit val decoder: Decoder[GeneratePricesReportRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GeneratePricesReportRequest] = deriveEncoder
}

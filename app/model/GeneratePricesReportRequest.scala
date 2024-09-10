package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Данные, необходимые для генерации отчета.
  * @param businessId Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. 
  * @param campaignId Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. 
  * @param categoryIds Фильтр по категориям на Маркете.
  * @param creationDateFrom Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. 
  * @param creationDateTo Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GeneratePricesReportRequest(
  businessId: Option[Long],
  campaignId: Option[Long],
  categoryIds: Option[List[Long]],
  creationDateFrom: Option[LocalDate],
  creationDateTo: Option[LocalDate]
)

object GeneratePricesReportRequest {
  implicit lazy val generatePricesReportRequestJsonFormat: Format[GeneratePricesReportRequest] = Json.format[GeneratePricesReportRequest]
}


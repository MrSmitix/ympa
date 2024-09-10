package org.openapitools.server.model

import java.time.LocalDate

/**
 * Данные, необходимые для генерации отчета.
 *
 * @param businessId Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`.  for example: ''null''
 * @param campaignId Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно.  for example: ''null''
 * @param categoryIds Фильтр по категориям на Маркете. for example: ''null''
 * @param creationDateFrom Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`.  for example: ''null''
 * @param creationDateTo Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`.  for example: ''null''
*/
final case class GeneratePricesReportRequest (
  businessId: Option[Long] = None,
  campaignId: Option[Long] = None,
  categoryIds: Option[Seq[Long]] = None,
  creationDateFrom: Option[LocalDate] = None,
  creationDateTo: Option[LocalDate] = None
)


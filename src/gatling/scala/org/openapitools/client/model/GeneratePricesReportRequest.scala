
package org.openapitools.client.model

import java.time.LocalDate

case class GeneratePricesReportRequest (
    /* Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`.  */
    _businessId: Option[Long],
    /* Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно.  */
    _campaignId: Option[Long],
    /* Фильтр по категориям на Маркете. */
    _categoryIds: Option[List[Long]],
    /* Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`.  */
    _creationDateFrom: Option[LocalDate],
    /* Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`.  */
    _creationDateTo: Option[LocalDate]
)
object GeneratePricesReportRequest {
    def toStringBody(var_businessId: Object, var_campaignId: Object, var_categoryIds: Object, var_creationDateFrom: Object, var_creationDateTo: Object) =
        s"""
        | {
        | "businessId":$var_businessId,"campaignId":$var_campaignId,"categoryIds":$var_categoryIds,"creationDateFrom":$var_creationDateFrom,"creationDateTo":$var_creationDateTo
        | }
        """.stripMargin
}

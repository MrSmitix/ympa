
package org.openapitools.client.model

import java.time.LocalDate
import java.time.OffsetDateTime

case class GenerateUnitedMarketplaceServicesReportRequest (
    /* Идентификатор бизнеса. */
    _businessId: Long,
    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  */
    _dateTimeFrom: Option[OffsetDateTime],
    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  */
    _dateTimeTo: Option[OffsetDateTime],
    /* Начало периода, включительно. */
    _dateFrom: Option[LocalDate],
    /* Конец периода, включительно. Максимальный период — 1 год. */
    _dateTo: Option[LocalDate],
    /* Начальный год формирования акта. */
    _yearFrom: Option[Integer],
    /* Начальный номер месяца формирования акта. */
    _monthFrom: Option[Integer],
    /* Конечный год формирования акта. */
    _yearTo: Option[Integer],
    /* Конечный номер месяца формирования акта. */
    _monthTo: Option[Integer],
    /* Список моделей, которые нужны в отчете.  */
    _placementPrograms: Option[List[PlacementType]],
    /* Список ИНН, которые нужны в отчете. */
    _inns: Option[List[String]],
    /* Список магазинов, которые нужны в отчете. */
    _campaignIds: Option[List[Long]]
)
object GenerateUnitedMarketplaceServicesReportRequest {
    def toStringBody(var_businessId: Object, var_dateTimeFrom: Object, var_dateTimeTo: Object, var_dateFrom: Object, var_dateTo: Object, var_yearFrom: Object, var_monthFrom: Object, var_yearTo: Object, var_monthTo: Object, var_placementPrograms: Object, var_inns: Object, var_campaignIds: Object) =
        s"""
        | {
        | "businessId":$var_businessId,"dateTimeFrom":$var_dateTimeFrom,"dateTimeTo":$var_dateTimeTo,"dateFrom":$var_dateFrom,"dateTo":$var_dateTo,"yearFrom":$var_yearFrom,"monthFrom":$var_monthFrom,"yearTo":$var_yearTo,"monthTo":$var_monthTo,"placementPrograms":$var_placementPrograms,"inns":$var_inns,"campaignIds":$var_campaignIds
        | }
        """.stripMargin
}

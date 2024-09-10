
package org.openapitools.client.model

import java.time.LocalDate

case class GenerateCompetitorsPositionReportRequest (
    /* Идентификатор бизнеса. */
    _businessId: Long,
    /* Идентификатор категории. */
    _categoryId: Long,
    /* Начало периода, включительно. */
    _dateFrom: LocalDate,
    /* Конец периода, включительно. */
    _dateTo: LocalDate
)
object GenerateCompetitorsPositionReportRequest {
    def toStringBody(var_businessId: Object, var_categoryId: Object, var_dateFrom: Object, var_dateTo: Object) =
        s"""
        | {
        | "businessId":$var_businessId,"categoryId":$var_categoryId,"dateFrom":$var_dateFrom,"dateTo":$var_dateTo
        | }
        """.stripMargin
}

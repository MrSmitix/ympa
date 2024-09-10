
package org.openapitools.client.model

import java.time.LocalDate

case class GenerateBoostConsolidatedRequest (
    /* Идентификатор бизнеса. */
    _businessId: Long,
    /* Начало периода, включительно. */
    _dateFrom: LocalDate,
    /* Конец периода, включительно. */
    _dateTo: LocalDate
)
object GenerateBoostConsolidatedRequest {
    def toStringBody(var_businessId: Object, var_dateFrom: Object, var_dateTo: Object) =
        s"""
        | {
        | "businessId":$var_businessId,"dateFrom":$var_dateFrom,"dateTo":$var_dateTo
        | }
        """.stripMargin
}

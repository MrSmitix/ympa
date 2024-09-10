
package org.openapitools.client.model

import java.time.LocalDate

case class GenerateShelfsStatisticsRequest (
    /* Идентификатор бизнеса. */
    _businessId: Long,
    /* Начало периода, включительно. */
    _dateFrom: LocalDate,
    /* Конец периода, включительно. */
    _dateTo: LocalDate,
    _attributionType: ShelfsStatisticsAttributionType
)
object GenerateShelfsStatisticsRequest {
    def toStringBody(var_businessId: Object, var_dateFrom: Object, var_dateTo: Object, var_attributionType: Object) =
        s"""
        | {
        | "businessId":$var_businessId,"dateFrom":$var_dateFrom,"dateTo":$var_dateTo,"attributionType":$var_attributionType
        | }
        """.stripMargin
}

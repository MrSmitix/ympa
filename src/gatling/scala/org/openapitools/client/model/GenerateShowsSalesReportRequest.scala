
package org.openapitools.client.model

import java.time.LocalDate

case class GenerateShowsSalesReportRequest (
    /* Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу.  */
    _businessId: Option[Long],
    /* Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу.  */
    _campaignId: Option[Long],
    /* Начало периода, включительно. */
    _dateFrom: LocalDate,
    /* Конец периода, включительно. */
    _dateTo: LocalDate,
    _grouping: ShowsSalesGroupingType
)
object GenerateShowsSalesReportRequest {
    def toStringBody(var_businessId: Object, var_campaignId: Object, var_dateFrom: Object, var_dateTo: Object, var_grouping: Object) =
        s"""
        | {
        | "businessId":$var_businessId,"campaignId":$var_campaignId,"dateFrom":$var_dateFrom,"dateTo":$var_dateTo,"grouping":$var_grouping
        | }
        """.stripMargin
}

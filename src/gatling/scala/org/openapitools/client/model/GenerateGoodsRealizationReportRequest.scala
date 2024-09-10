
package org.openapitools.client.model


case class GenerateGoodsRealizationReportRequest (
    /* Идентификатор кампании. */
    _campaignId: Long,
    /* Год. */
    _year: Integer,
    /* Номер месяца. */
    _month: Integer
)
object GenerateGoodsRealizationReportRequest {
    def toStringBody(var_campaignId: Object, var_year: Object, var_month: Object) =
        s"""
        | {
        | "campaignId":$var_campaignId,"year":$var_year,"month":$var_month
        | }
        """.stripMargin
}

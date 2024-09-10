
package org.openapitools.client.model


case class CampaignSettingsTimePeriodDTO (
    /* Формат даты: `ДД-ММ-ГГГГ`.  */
    _fromDate: Option[String],
    /* Формат даты: `ДД-ММ-ГГГГ`.  */
    _toDate: Option[String]
)
object CampaignSettingsTimePeriodDTO {
    def toStringBody(var_fromDate: Object, var_toDate: Object) =
        s"""
        | {
        | "fromDate":$var_fromDate,"toDate":$var_toDate
        | }
        """.stripMargin
}

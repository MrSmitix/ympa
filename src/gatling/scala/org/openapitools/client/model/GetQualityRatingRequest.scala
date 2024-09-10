
package org.openapitools.client.model

import java.time.LocalDate

case class GetQualityRatingRequest (
    /* Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты.  */
    _dateFrom: Option[LocalDate],
    /* Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты.  */
    _dateTo: Option[LocalDate],
    /* Список идентификаторов магазинов. */
    _campaignIds: Set[Long]
)
object GetQualityRatingRequest {
    def toStringBody(var_dateFrom: Object, var_dateTo: Object, var_campaignIds: Object) =
        s"""
        | {
        | "dateFrom":$var_dateFrom,"dateTo":$var_dateTo,"campaignIds":$var_campaignIds
        | }
        """.stripMargin
}

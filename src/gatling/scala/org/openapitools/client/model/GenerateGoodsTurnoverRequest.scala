
package org.openapitools.client.model

import java.time.LocalDate

case class GenerateGoodsTurnoverRequest (
    /* Идентификатор кампании. */
    _campaignId: Long,
    /* Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата. */
    _date: Option[LocalDate]
)
object GenerateGoodsTurnoverRequest {
    def toStringBody(var_campaignId: Object, var_date: Object) =
        s"""
        | {
        | "campaignId":$var_campaignId,"date":$var_date
        | }
        """.stripMargin
}

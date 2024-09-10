
package org.openapitools.client.model

import java.time.OffsetDateTime

case class PromoPeriodDTO (
    /* Дата и время начала акции. */
    _dateTimeFrom: OffsetDateTime,
    /* Дата и время окончания акции. */
    _dateTimeTo: OffsetDateTime
)
object PromoPeriodDTO {
    def toStringBody(var_dateTimeFrom: Object, var_dateTimeTo: Object) =
        s"""
        | {
        | "dateTimeFrom":$var_dateTimeFrom,"dateTimeTo":$var_dateTimeTo
        | }
        """.stripMargin
}


package org.openapitools.client.model

import java.time.OffsetDateTime

case class UpdateTimeDTO (
    /* Время последнего обновления. */
    _updatedAt: OffsetDateTime
)
object UpdateTimeDTO {
    def toStringBody(var_updatedAt: Object) =
        s"""
        | {
        | "updatedAt":$var_updatedAt
        | }
        """.stripMargin
}


package org.openapitools.client.model

import java.time.OffsetDateTime

case class ShipmentStatusChangeDTO (
    _status: Option[ShipmentStatusType],
    /* Описание статуса отгрузки. */
    _description: Option[String],
    /* Время последнего изменения статуса отгрузки. */
    _updateTime: Option[OffsetDateTime]
)
object ShipmentStatusChangeDTO {
    def toStringBody(var_status: Object, var_description: Object, var_updateTime: Object) =
        s"""
        | {
        | "status":$var_status,"description":$var_description,"updateTime":$var_updateTime
        | }
        """.stripMargin
}

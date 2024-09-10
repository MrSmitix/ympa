
package org.openapitools.client.model


case class ConfirmShipmentRequest (
    /* Идентификатор отгрузки в системе поставщика. */
    _externalShipmentId: Option[String]
)
object ConfirmShipmentRequest {
    def toStringBody(var_externalShipmentId: Object) =
        s"""
        | {
        | "externalShipmentId":$var_externalShipmentId
        | }
        """.stripMargin
}

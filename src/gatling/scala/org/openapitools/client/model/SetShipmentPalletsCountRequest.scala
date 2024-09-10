
package org.openapitools.client.model


case class SetShipmentPalletsCountRequest (
    /* Количество упаковок в отгрузке. */
    _placesCount: Integer
)
object SetShipmentPalletsCountRequest {
    def toStringBody(var_placesCount: Object) =
        s"""
        | {
        | "placesCount":$var_placesCount
        | }
        """.stripMargin
}

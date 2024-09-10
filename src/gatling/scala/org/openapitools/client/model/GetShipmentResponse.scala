
package org.openapitools.client.model


case class GetShipmentResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[ShipmentDTO]
)
object GetShipmentResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

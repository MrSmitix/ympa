
package org.openapitools.client.model


case class GetWarehousesResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[WarehousesDTO]
)
object GetWarehousesResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

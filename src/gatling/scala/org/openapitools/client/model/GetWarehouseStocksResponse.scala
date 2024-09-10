
package org.openapitools.client.model


case class GetWarehouseStocksResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[GetWarehouseStocksDTO]
)
object GetWarehouseStocksResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

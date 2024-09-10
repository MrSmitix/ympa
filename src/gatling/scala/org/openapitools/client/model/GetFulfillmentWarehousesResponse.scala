
package org.openapitools.client.model


case class GetFulfillmentWarehousesResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[FulfillmentWarehousesDTO]
)
object GetFulfillmentWarehousesResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

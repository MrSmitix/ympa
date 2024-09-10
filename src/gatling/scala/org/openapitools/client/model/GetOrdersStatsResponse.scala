
package org.openapitools.client.model


case class GetOrdersStatsResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[OrdersStatsDTO]
)
object GetOrdersStatsResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

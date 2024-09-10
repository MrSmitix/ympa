
package org.openapitools.client.model


case class GetOrderBuyerInfoResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[OrderBuyerInfoDTO]
)
object GetOrderBuyerInfoResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

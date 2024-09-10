
package org.openapitools.client.model


case class GetBusinessBuyerInfoResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[OrderBusinessBuyerDTO]
)
object GetBusinessBuyerInfoResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

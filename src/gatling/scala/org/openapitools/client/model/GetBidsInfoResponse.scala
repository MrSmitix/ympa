
package org.openapitools.client.model


case class GetBidsInfoResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[GetBidsInfoResponseDTO]
)
object GetBidsInfoResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

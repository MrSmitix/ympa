
package org.openapitools.client.model


case class GetQuarantineOffersResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[GetQuarantineOffersResultDTO]
)
object GetQuarantineOffersResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

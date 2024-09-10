
package org.openapitools.client.model


case class GetHiddenOffersResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[GetHiddenOffersResultDTO]
)
object GetHiddenOffersResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

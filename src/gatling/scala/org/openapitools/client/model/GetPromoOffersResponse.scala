
package org.openapitools.client.model


case class GetPromoOffersResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[GetPromoOffersResultDTO]
)
object GetPromoOffersResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

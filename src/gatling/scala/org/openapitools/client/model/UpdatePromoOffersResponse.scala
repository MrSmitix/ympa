
package org.openapitools.client.model


case class UpdatePromoOffersResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[UpdatePromoOffersResultDTO]
)
object UpdatePromoOffersResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

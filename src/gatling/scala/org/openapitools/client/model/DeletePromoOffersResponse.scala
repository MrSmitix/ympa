
package org.openapitools.client.model


case class DeletePromoOffersResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[DeletePromoOffersResultDTO]
)
object DeletePromoOffersResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

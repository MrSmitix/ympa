
package org.openapitools.client.model


case class GetPricesResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[OfferPriceListResponseDTO]
)
object GetPricesResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

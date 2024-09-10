
package org.openapitools.client.model


case class GetPricesByOfferIdsResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[OfferPriceByOfferIdsListResponseDTO]
)
object GetPricesByOfferIdsResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

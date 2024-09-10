
package org.openapitools.client.model


case class GetOfferRecommendationsResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[OfferRecommendationsResultDTO]
)
object GetOfferRecommendationsResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

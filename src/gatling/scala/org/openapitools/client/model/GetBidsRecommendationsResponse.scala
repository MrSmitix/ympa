
package org.openapitools.client.model


case class GetBidsRecommendationsResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[GetBidsRecommendationsResponseDTO]
)
object GetBidsRecommendationsResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

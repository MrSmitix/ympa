
package org.openapitools.client.model


case class GetSuggestedOfferMappingsResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[GetSuggestedOfferMappingsResultDTO]
)
object GetSuggestedOfferMappingsResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

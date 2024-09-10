
package org.openapitools.client.model


case class GetSuggestedOfferMappingEntriesResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[OfferMappingSuggestionsListDTO]
)
object GetSuggestedOfferMappingEntriesResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class GetCampaignOffersResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[GetCampaignOffersResultDTO]
)
object GetCampaignOffersResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class DeleteCampaignOffersResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[DeleteCampaignOffersDTO]
)
object DeleteCampaignOffersResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

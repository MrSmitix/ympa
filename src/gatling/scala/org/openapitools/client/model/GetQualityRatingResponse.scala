
package org.openapitools.client.model


case class GetQualityRatingResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[CampaignsQualityRatingDTO]
)
object GetQualityRatingResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

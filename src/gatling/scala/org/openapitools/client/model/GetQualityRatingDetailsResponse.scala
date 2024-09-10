
package org.openapitools.client.model


case class GetQualityRatingDetailsResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[QualityRatingDetailsDTO]
)
object GetQualityRatingDetailsResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class GetFeedbackListResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[FeedbackListDTO]
)
object GetFeedbackListResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

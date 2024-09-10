
package org.openapitools.client.model


case class GetGoodsFeedbackCommentsResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[GoodsFeedbackCommentListDTO]
)
object GetGoodsFeedbackCommentsResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

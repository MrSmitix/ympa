
package org.openapitools.client.model


case class UpdateGoodsFeedbackCommentResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[GoodsFeedbackCommentDTO]
)
object UpdateGoodsFeedbackCommentResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}

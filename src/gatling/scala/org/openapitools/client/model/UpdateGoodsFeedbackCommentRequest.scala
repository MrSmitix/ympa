
package org.openapitools.client.model


case class UpdateGoodsFeedbackCommentRequest (
    /* Идентификатор отзыва.  */
    _feedbackId: Long,
    _comment: UpdateGoodsFeedbackCommentDTO
)
object UpdateGoodsFeedbackCommentRequest {
    def toStringBody(var_feedbackId: Object, var_comment: Object) =
        s"""
        | {
        | "feedbackId":$var_feedbackId,"comment":$var_comment
        | }
        """.stripMargin
}

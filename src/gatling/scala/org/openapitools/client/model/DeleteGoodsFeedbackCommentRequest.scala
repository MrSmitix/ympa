
package org.openapitools.client.model


case class DeleteGoodsFeedbackCommentRequest (
    /* Идентификатор комментария к отзыву.  */
    _id: Long
)
object DeleteGoodsFeedbackCommentRequest {
    def toStringBody(var_id: Object) =
        s"""
        | {
        | "id":$var_id
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class GetGoodsFeedbackCommentsRequest (
    /* Идентификатор отзыва.  */
    _feedbackId: Long
)
object GetGoodsFeedbackCommentsRequest {
    def toStringBody(var_feedbackId: Object) =
        s"""
        | {
        | "feedbackId":$var_feedbackId
        | }
        """.stripMargin
}

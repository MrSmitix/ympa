
package org.openapitools.client.model


case class SkipGoodsFeedbackReactionRequest (
    /* Список идентификаторов отзывов, на которые магазин не будет отвечать. */
    _feedbackIds: Set[Long]
)
object SkipGoodsFeedbackReactionRequest {
    def toStringBody(var_feedbackIds: Object) =
        s"""
        | {
        | "feedbackIds":$var_feedbackIds
        | }
        """.stripMargin
}

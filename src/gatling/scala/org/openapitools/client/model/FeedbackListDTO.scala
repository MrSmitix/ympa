
package org.openapitools.client.model


case class FeedbackListDTO (
    _paging: Option[ScrollingPagerDTO],
    /* Список отзывов.  Содержит не более 20 отзывов.  */
    _feedbackList: List[FeedbackDTO]
)
object FeedbackListDTO {
    def toStringBody(var_paging: Object, var_feedbackList: Object) =
        s"""
        | {
        | "paging":$var_paging,"feedbackList":$var_feedbackList
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class GoodsFeedbackListDTO (
    /* Список отзывов. */
    _feedbacks: List[GoodsFeedbackDTO],
    _paging: Option[ForwardScrollingPagerDTO]
)
object GoodsFeedbackListDTO {
    def toStringBody(var_feedbacks: Object, var_paging: Object) =
        s"""
        | {
        | "feedbacks":$var_feedbacks,"paging":$var_paging
        | }
        """.stripMargin
}

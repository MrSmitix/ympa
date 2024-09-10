
package org.openapitools.client.model


case class GoodsFeedbackCommentListDTO (
    /* Список комментариев. */
    _comments: List[GoodsFeedbackCommentDTO],
    _paging: Option[ForwardScrollingPagerDTO]
)
object GoodsFeedbackCommentListDTO {
    def toStringBody(var_comments: Object, var_paging: Object) =
        s"""
        | {
        | "comments":$var_comments,"paging":$var_paging
        | }
        """.stripMargin
}

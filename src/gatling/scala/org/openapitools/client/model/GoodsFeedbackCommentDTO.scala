
package org.openapitools.client.model


case class GoodsFeedbackCommentDTO (
    /* Идентификатор комментария к отзыву.  */
    _id: Long,
    /* Текст комментария. */
    _text: String,
    /* Может ли продавец изменять комментарий или удалять его. */
    _canModify: Option[Boolean],
    /* Идентификатор комментария к отзыву.  */
    _parentId: Option[Long],
    _author: GoodsFeedbackCommentAuthorDTO,
    _status: GoodsFeedbackCommentStatusType
)
object GoodsFeedbackCommentDTO {
    def toStringBody(var_id: Object, var_text: Object, var_canModify: Object, var_parentId: Object, var_author: Object, var_status: Object) =
        s"""
        | {
        | "id":$var_id,"text":$var_text,"canModify":$var_canModify,"parentId":$var_parentId,"author":$var_author,"status":$var_status
        | }
        """.stripMargin
}

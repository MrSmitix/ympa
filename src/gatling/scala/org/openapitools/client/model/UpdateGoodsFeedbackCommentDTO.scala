
package org.openapitools.client.model


case class UpdateGoodsFeedbackCommentDTO (
    /* Идентификатор комментария к отзыву.  */
    _id: Option[Long],
    /* Идентификатор комментария к отзыву.  */
    _parentId: Option[Long],
    /* Текст комментария. */
    _text: String
)
object UpdateGoodsFeedbackCommentDTO {
    def toStringBody(var_id: Object, var_parentId: Object, var_text: Object) =
        s"""
        | {
        | "id":$var_id,"parentId":$var_parentId,"text":$var_text
        | }
        """.stripMargin
}

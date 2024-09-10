
package org.openapitools.client.model

import java.time.OffsetDateTime

case class FeedbackCommentDTO (
    /* Идентификатор ответа. */
    _id: Option[Long],
    /* Идентификатор родительского ответа. */
    _parentId: Option[Long],
    /* Текст ответа. */
    _body: Option[String],
    /* Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  */
    _createdAt: Option[OffsetDateTime],
    /* Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  */
    _updatedAt: Option[OffsetDateTime],
    _author: Option[FeedbackCommentAuthorDTO],
    /* Дочерние ответы. */
    _children: Option[List[FeedbackCommentDTO]]
)
object FeedbackCommentDTO {
    def toStringBody(var_id: Object, var_parentId: Object, var_body: Object, var_createdAt: Object, var_updatedAt: Object, var_author: Object, var_children: Object) =
        s"""
        | {
        | "id":$var_id,"parentId":$var_parentId,"body":$var_body,"createdAt":$var_createdAt,"updatedAt":$var_updatedAt,"author":$var_author,"children":$var_children
        | }
        """.stripMargin
}

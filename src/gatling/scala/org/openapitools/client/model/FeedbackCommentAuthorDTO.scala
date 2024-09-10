
package org.openapitools.client.model


case class FeedbackCommentAuthorDTO (
    _type: Option[FeedbackCommentAuthorType],
    /* Имя автора отзыва или название магазина. */
    _name: Option[String]
)
object FeedbackCommentAuthorDTO {
    def toStringBody(var_type: Object, var_name: Object) =
        s"""
        | {
        | "type":$var_type,"name":$var_name
        | }
        """.stripMargin
}

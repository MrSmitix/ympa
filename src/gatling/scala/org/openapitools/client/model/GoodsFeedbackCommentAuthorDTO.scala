
package org.openapitools.client.model


case class GoodsFeedbackCommentAuthorDTO (
    _type: Option[GoodsFeedbackCommentAuthorType],
    /* Имя автора или название кабинета. */
    _name: Option[String]
)
object GoodsFeedbackCommentAuthorDTO {
    def toStringBody(var_type: Object, var_name: Object) =
        s"""
        | {
        | "type":$var_type,"name":$var_name
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class GoodsFeedbackDescriptionDTO (
    /* Описание плюсов товара в отзыве. */
    _advantages: Option[String],
    /* Описание минусов товара в отзыве. */
    _disadvantages: Option[String],
    /* Комментарий в отзыве. */
    _comment: Option[String]
)
object GoodsFeedbackDescriptionDTO {
    def toStringBody(var_advantages: Object, var_disadvantages: Object, var_comment: Object) =
        s"""
        | {
        | "advantages":$var_advantages,"disadvantages":$var_disadvantages,"comment":$var_comment
        | }
        """.stripMargin
}

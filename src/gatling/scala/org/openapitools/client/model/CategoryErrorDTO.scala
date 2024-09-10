
package org.openapitools.client.model


case class CategoryErrorDTO (
    /* Идентификатор категории. */
    _categoryId: Option[Long],
    _type: Option[CategoryErrorType]
)
object CategoryErrorDTO {
    def toStringBody(var_categoryId: Object, var_type: Object) =
        s"""
        | {
        | "categoryId":$var_categoryId,"type":$var_type
        | }
        """.stripMargin
}

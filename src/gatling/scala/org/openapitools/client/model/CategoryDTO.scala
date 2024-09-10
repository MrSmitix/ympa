
package org.openapitools.client.model


case class CategoryDTO (
    /* Идентификатор категории. */
    _id: Long,
    /* Название категории. */
    _name: String,
    /* Дочерние категории. */
    _children: Option[List[CategoryDTO]]
)
object CategoryDTO {
    def toStringBody(var_id: Object, var_name: Object, var_children: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"children":$var_children
        | }
        """.stripMargin
}

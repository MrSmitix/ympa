
package org.openapitools.client.model


case class RegionDTO (
    /* Идентификатор региона. */
    _id: Option[Long],
    /* Название региона. */
    _name: String,
    _type: RegionType,
    _parent: Option[RegionDTO],
    /* Дочерние регионы. */
    _children: Option[List[RegionDTO]]
)
object RegionDTO {
    def toStringBody(var_id: Object, var_name: Object, var_type: Object, var_parent: Object, var_children: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"type":$var_type,"parent":$var_parent,"children":$var_children
        | }
        """.stripMargin
}

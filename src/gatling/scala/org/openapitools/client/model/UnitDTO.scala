
package org.openapitools.client.model


case class UnitDTO (
    /* Идентификатор единицы измерения. */
    _id: Long,
    /* Сокращенное название единицы измерения. */
    _name: String,
    /* Полное название единицы измерения. */
    _fullName: String
)
object UnitDTO {
    def toStringBody(var_id: Object, var_name: Object, var_fullName: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"fullName":$var_fullName
        | }
        """.stripMargin
}

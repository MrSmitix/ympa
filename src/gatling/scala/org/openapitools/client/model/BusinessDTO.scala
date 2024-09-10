
package org.openapitools.client.model


case class BusinessDTO (
    /* Идентификатор кабинета. */
    _id: Option[Long],
    /* Название бизнеса. */
    _name: Option[String]
)
object BusinessDTO {
    def toStringBody(var_id: Object, var_name: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name
        | }
        """.stripMargin
}

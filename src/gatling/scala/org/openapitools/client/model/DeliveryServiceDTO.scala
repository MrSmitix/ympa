
package org.openapitools.client.model


case class DeliveryServiceDTO (
    /* Идентификатор службы доставки. */
    _id: Option[Long],
    /* Наименование службы доставки. */
    _name: Option[String]
)
object DeliveryServiceDTO {
    def toStringBody(var_id: Object, var_name: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name
        | }
        """.stripMargin
}

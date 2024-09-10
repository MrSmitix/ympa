
package org.openapitools.client.model


case class DeliveryServiceInfoDTO (
    /* Идентификатор службы доставки. */
    _id: Long,
    /* Наименование службы доставки. */
    _name: String
)
object DeliveryServiceInfoDTO {
    def toStringBody(var_id: Object, var_name: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name
        | }
        """.stripMargin
}

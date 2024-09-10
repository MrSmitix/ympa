
package org.openapitools.client.model


case class FulfillmentWarehouseDTO (
    /* Идентификатор склада. */
    _id: Long,
    /* Название склада. */
    _name: String,
    _address: Option[WarehouseAddressDTO]
)
object FulfillmentWarehouseDTO {
    def toStringBody(var_id: Object, var_name: Object, var_address: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"address":$var_address
        | }
        """.stripMargin
}

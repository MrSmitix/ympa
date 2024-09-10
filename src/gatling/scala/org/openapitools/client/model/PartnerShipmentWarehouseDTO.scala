
package org.openapitools.client.model


case class PartnerShipmentWarehouseDTO (
    /* Идентификатор склада отправления. */
    _id: Option[Long],
    /* Наименование склада отправления. */
    _name: Option[String],
    /* Адрес склада отправления. */
    _address: Option[String]
)
object PartnerShipmentWarehouseDTO {
    def toStringBody(var_id: Object, var_name: Object, var_address: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"address":$var_address
        | }
        """.stripMargin
}

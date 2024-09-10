
package org.openapitools.client.model


case class WarehouseAddressDTO (
    /* Город. */
    _city: String,
    /* Улица. */
    _street: Option[String],
    /* Номер дома. */
    _number: Option[String],
    /* Номер строения. */
    _building: Option[String],
    /* Номер корпуса. */
    _block: Option[String],
    _gps: GpsDTO
)
object WarehouseAddressDTO {
    def toStringBody(var_city: Object, var_street: Object, var_number: Object, var_building: Object, var_block: Object, var_gps: Object) =
        s"""
        | {
        | "city":$var_city,"street":$var_street,"number":$var_number,"building":$var_building,"block":$var_block,"gps":$var_gps
        | }
        """.stripMargin
}

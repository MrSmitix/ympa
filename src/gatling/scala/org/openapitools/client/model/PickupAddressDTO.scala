
package org.openapitools.client.model


case class PickupAddressDTO (
    /* Страна. */
    _country: Option[String],
    /* Город. */
    _city: Option[String],
    /* Улица. */
    _street: Option[String],
    /* Номер дома. */
    _house: Option[String],
    /* Почтовый индекс. */
    _postcode: Option[String]
)
object PickupAddressDTO {
    def toStringBody(var_country: Object, var_city: Object, var_street: Object, var_house: Object, var_postcode: Object) =
        s"""
        | {
        | "country":$var_country,"city":$var_city,"street":$var_street,"house":$var_house,"postcode":$var_postcode
        | }
        """.stripMargin
}

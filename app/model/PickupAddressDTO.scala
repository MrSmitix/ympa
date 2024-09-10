package model

import play.api.libs.json._

/**
  * Адрес доставки.
  * @param country Страна.
  * @param city Город.
  * @param street Улица.
  * @param house Номер дома.
  * @param postcode Почтовый индекс.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class PickupAddressDTO(
  country: Option[String],
  city: Option[String],
  street: Option[String],
  house: Option[String],
  postcode: Option[String]
)

object PickupAddressDTO {
  implicit lazy val pickupAddressDTOJsonFormat: Format[PickupAddressDTO] = Json.format[PickupAddressDTO]
}


package model

import play.api.libs.json._

/**
  * Адрес склада.
  * @param city Город.
  * @param street Улица.
  * @param number Номер дома.
  * @param building Номер строения.
  * @param block Номер корпуса.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class WarehouseAddressDTO(
  city: String,
  street: Option[String],
  number: Option[String],
  building: Option[String],
  block: Option[String],
  gps: GpsDTO
)

object WarehouseAddressDTO {
  implicit lazy val warehouseAddressDTOJsonFormat: Format[WarehouseAddressDTO] = Json.format[WarehouseAddressDTO]
}


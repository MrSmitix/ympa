package model

import play.api.libs.json._

/**
  * Склад Маркета (FBY).
  * @param id Идентификатор склада.
  * @param name Название склада.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FulfillmentWarehouseDTO(
  id: Long,
  name: String,
  address: Option[WarehouseAddressDTO]
)

object FulfillmentWarehouseDTO {
  implicit lazy val fulfillmentWarehouseDTOJsonFormat: Format[FulfillmentWarehouseDTO] = Json.format[FulfillmentWarehouseDTO]
}


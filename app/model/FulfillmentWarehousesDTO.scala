package model

import play.api.libs.json._

/**
  * Список складов Маркета (FBY).
  * @param warehouses Список складов Маркета (FBY).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FulfillmentWarehousesDTO(
  warehouses: List[FulfillmentWarehouseDTO]
)

object FulfillmentWarehousesDTO {
  implicit lazy val fulfillmentWarehousesDTOJsonFormat: Format[FulfillmentWarehousesDTO] = Json.format[FulfillmentWarehousesDTO]
}


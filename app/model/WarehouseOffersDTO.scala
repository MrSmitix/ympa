package model

import play.api.libs.json._

/**
  * Информация об остатках товаров на складе.
  * @param warehouseId Идентификатор склада.
  * @param offers Информация об остатках.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class WarehouseOffersDTO(
  warehouseId: Long,
  offers: List[WarehouseOfferDTO]
)

object WarehouseOffersDTO {
  implicit lazy val warehouseOffersDTOJsonFormat: Format[WarehouseOffersDTO] = Json.format[WarehouseOffersDTO]
}


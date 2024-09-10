package model

import play.api.libs.json._

/**
  * Цена или скидки на товар.
  * @param costPerItem Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. 
  * @param total Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrdersStatsPriceDTO(
  `type`: Option[OrdersStatsPriceType],
  costPerItem: Option[BigDecimal],
  total: Option[BigDecimal]
)

object OrdersStatsPriceDTO {
  implicit lazy val ordersStatsPriceDTOJsonFormat: Format[OrdersStatsPriceDTO] = Json.format[OrdersStatsPriceDTO]
}


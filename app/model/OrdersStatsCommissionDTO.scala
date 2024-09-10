package model

import play.api.libs.json._

/**
  * Информация о стоимости услуг.
  * @param actual Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrdersStatsCommissionDTO(
  `type`: Option[OrdersStatsCommissionType],
  actual: Option[BigDecimal]
)

object OrdersStatsCommissionDTO {
  implicit lazy val ordersStatsCommissionDTOJsonFormat: Format[OrdersStatsCommissionDTO] = Json.format[OrdersStatsCommissionDTO]
}


package model

import play.api.libs.json._

/**
  * Информация по заказам.
  * @param orders Список заказов.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrdersStatsDTO(
  orders: List[OrdersStatsOrderDTO],
  paging: Option[ForwardScrollingPagerDTO]
)

object OrdersStatsDTO {
  implicit lazy val ordersStatsDTOJsonFormat: Format[OrdersStatsDTO] = Json.format[OrdersStatsDTO]
}


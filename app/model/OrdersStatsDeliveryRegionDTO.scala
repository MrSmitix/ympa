package model

import play.api.libs.json._

/**
  * Информация о регионе доставки.
  * @param id Идентификатор региона доставки.
  * @param name Название региона доставки.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrdersStatsDeliveryRegionDTO(
  id: Option[Long],
  name: Option[String]
)

object OrdersStatsDeliveryRegionDTO {
  implicit lazy val ordersStatsDeliveryRegionDTOJsonFormat: Format[OrdersStatsDeliveryRegionDTO] = Json.format[OrdersStatsDeliveryRegionDTO]
}


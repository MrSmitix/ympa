package model

import play.api.libs.json._
import scala.collection.immutable.Set

/**
  * Годные/негодные ярлыки по заказам в отгрузке.
  * @param orderIdsWithLabels Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
  * @param orderIdsWithoutLabels Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrdersShipmentInfoDTO(
  orderIdsWithLabels: Set[Long],
  orderIdsWithoutLabels: Set[Long]
)

object OrdersShipmentInfoDTO {
  implicit lazy val ordersShipmentInfoDTOJsonFormat: Format[OrdersShipmentInfoDTO] = Json.format[OrdersShipmentInfoDTO]
}


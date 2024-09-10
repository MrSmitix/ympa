package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Годные/негодные ярлыки по заказам в отгрузке.
 * @param orderIdsWithLabels Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
 * @param orderIdsWithoutLabels Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
 */
case class OrdersShipmentInfoDTO(orderIdsWithLabels: Set[Long],
                orderIdsWithoutLabels: Set[Long]
                )

object OrdersShipmentInfoDTO {
    /**
     * Creates the codec for converting OrdersShipmentInfoDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrdersShipmentInfoDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrdersShipmentInfoDTO] = deriveEncoder
}

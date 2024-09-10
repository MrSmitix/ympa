package org.openapitools.server.model


/**
 * Годные/негодные ярлыки по заказам в отгрузке.
 *
 * @param orderIdsWithLabels Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки. for example: ''null''
 * @param orderIdsWithoutLabels Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки. for example: ''null''
*/
final case class OrdersShipmentInfoDTO (
  orderIdsWithLabels: Set[Long],
  orderIdsWithoutLabels: Set[Long]
)


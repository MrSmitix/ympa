
package org.openapitools.client.model


case class OrdersShipmentInfoDTO (
    /* Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки. */
    _orderIdsWithLabels: Set[Long],
    /* Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки. */
    _orderIdsWithoutLabels: Set[Long]
)
object OrdersShipmentInfoDTO {
    def toStringBody(var_orderIdsWithLabels: Object, var_orderIdsWithoutLabels: Object) =
        s"""
        | {
        | "orderIdsWithLabels":$var_orderIdsWithLabels,"orderIdsWithoutLabels":$var_orderIdsWithoutLabels
        | }
        """.stripMargin
}

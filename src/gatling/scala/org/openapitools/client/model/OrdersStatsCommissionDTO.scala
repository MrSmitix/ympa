
package org.openapitools.client.model


case class OrdersStatsCommissionDTO (
    _type: Option[OrdersStatsCommissionType],
    /* Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой.  */
    _actual: Option[Number]
)
object OrdersStatsCommissionDTO {
    def toStringBody(var_type: Object, var_actual: Object) =
        s"""
        | {
        | "type":$var_type,"actual":$var_actual
        | }
        """.stripMargin
}

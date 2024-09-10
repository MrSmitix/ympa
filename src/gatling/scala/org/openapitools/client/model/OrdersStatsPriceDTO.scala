
package org.openapitools.client.model


case class OrdersStatsPriceDTO (
    _type: Option[OrdersStatsPriceType],
    /* Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой.  */
    _costPerItem: Option[Number],
    /* Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой.  */
    _total: Option[Number]
)
object OrdersStatsPriceDTO {
    def toStringBody(var_type: Object, var_costPerItem: Object, var_total: Object) =
        s"""
        | {
        | "type":$var_type,"costPerItem":$var_costPerItem,"total":$var_total
        | }
        """.stripMargin
}

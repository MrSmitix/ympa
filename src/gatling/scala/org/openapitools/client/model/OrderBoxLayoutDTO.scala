
package org.openapitools.client.model


case class OrderBoxLayoutDTO (
    /* Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.  */
    _items: List[OrderBoxLayoutItemDTO]
)
object OrderBoxLayoutDTO {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}

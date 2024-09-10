
package org.openapitools.client.model


case class EnrichedOrderBoxLayoutDTO (
    /* Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.  */
    _items: List[OrderBoxLayoutItemDTO],
    /* Идентификатор коробки. */
    _boxId: Option[Long]
)
object EnrichedOrderBoxLayoutDTO {
    def toStringBody(var_items: Object, var_boxId: Object) =
        s"""
        | {
        | "items":$var_items,"boxId":$var_boxId
        | }
        """.stripMargin
}

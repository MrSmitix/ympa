
package org.openapitools.client.model


case class UpdateStockDTO (
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    _sku: String,
    /* Информация об остатках товара.  */
    _items: List[UpdateStockItemDTO]
)
object UpdateStockDTO {
    def toStringBody(var_sku: Object, var_items: Object) =
        s"""
        | {
        | "sku":$var_sku,"items":$var_items
        | }
        """.stripMargin
}

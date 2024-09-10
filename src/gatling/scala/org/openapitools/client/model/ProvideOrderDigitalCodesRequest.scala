
package org.openapitools.client.model


case class ProvideOrderDigitalCodesRequest (
    /* Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. `id` у этих элементов должен быть один и тот же.  */
    _items: List[OrderDigitalItemDTO]
)
object ProvideOrderDigitalCodesRequest {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}

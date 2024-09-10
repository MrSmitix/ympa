
package org.openapitools.client.model

import java.time.LocalDate

case class OrderStatusChangeDeliveryDatesDTO (
    /* **Только для модели DBS**  Фактическая дата доставки. <br><br> Когда передавать параметр `realDeliveryDate`:  * Не передавайте параметр, если:   * переводите заказ в любой статус, кроме `PICKUP` или `DELIVERED`;   * меняете статус заказа на `PICKUP` или `DELIVERED` в день доставки — будет указана дата выполнения запроса. * Передавайте дату доставки, если переводите заказ в статус `PICKUP` или `DELIVERED` не в день доставки. Нельзя указывать дату доставки в будущем.    {% note warning \"Индекс качества\" %}    Передача статуса после установленного срока снижает индекс качества. О сроках читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/tech#dbs).    {% endnote %}       */
    _realDeliveryDate: Option[LocalDate]
)
object OrderStatusChangeDeliveryDatesDTO {
    def toStringBody(var_realDeliveryDate: Object) =
        s"""
        | {
        | "realDeliveryDate":$var_realDeliveryDate
        | }
        """.stripMargin
}


package org.openapitools.client.model

import java.time.OffsetDateTime

case class WarehouseOfferDTO (
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    _offerId: String,
    _turnoverSummary: Option[TurnoverDTO],
    /* Информация об остатках. */
    _stocks: List[WarehouseStockDTO],
    /* Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`.  */
    _updatedAt: Option[OffsetDateTime]
)
object WarehouseOfferDTO {
    def toStringBody(var_offerId: Object, var_turnoverSummary: Object, var_stocks: Object, var_updatedAt: Object) =
        s"""
        | {
        | "offerId":$var_offerId,"turnoverSummary":$var_turnoverSummary,"stocks":$var_stocks,"updatedAt":$var_updatedAt
        | }
        """.stripMargin
}

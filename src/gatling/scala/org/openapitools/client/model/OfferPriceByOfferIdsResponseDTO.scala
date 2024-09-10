
package org.openapitools.client.model

import java.time.OffsetDateTime

case class OfferPriceByOfferIdsResponseDTO (
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    _offerId: Option[String],
    _price: Option[PriceDTO],
    /* Дата и время последнего обновления цены. */
    _updatedAt: Option[OffsetDateTime]
)
object OfferPriceByOfferIdsResponseDTO {
    def toStringBody(var_offerId: Object, var_price: Object, var_updatedAt: Object) =
        s"""
        | {
        | "offerId":$var_offerId,"price":$var_price,"updatedAt":$var_updatedAt
        | }
        """.stripMargin
}

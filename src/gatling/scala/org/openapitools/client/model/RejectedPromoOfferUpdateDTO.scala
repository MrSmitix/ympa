
package org.openapitools.client.model


case class RejectedPromoOfferUpdateDTO (
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    _offerId: String,
    _reason: RejectedPromoOfferUpdateReasonType
)
object RejectedPromoOfferUpdateDTO {
    def toStringBody(var_offerId: Object, var_reason: Object) =
        s"""
        | {
        | "offerId":$var_offerId,"reason":$var_reason
        | }
        """.stripMargin
}

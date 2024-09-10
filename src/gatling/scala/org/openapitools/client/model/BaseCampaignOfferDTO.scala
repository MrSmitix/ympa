
package org.openapitools.client.model


case class BaseCampaignOfferDTO (
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    _offerId: String,
    _quantum: Option[QuantumDTO],
    /* Есть ли товар в продаже.  */
    _available: Option[Boolean]
)
object BaseCampaignOfferDTO {
    def toStringBody(var_offerId: Object, var_quantum: Object, var_available: Object) =
        s"""
        | {
        | "offerId":$var_offerId,"quantum":$var_quantum,"available":$var_available
        | }
        """.stripMargin
}

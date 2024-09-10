
package org.openapitools.client.model


case class UpdateCampaignOfferDTO (
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    _offerId: String,
    _quantum: Option[QuantumDTO],
    /* Есть ли товар в продаже.  */
    _available: Option[Boolean],
    /* Ставка НДС, применяемая для товара. Задается цифрой:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете продавца на Маркете.  */
    _vat: Option[Integer]
)
object UpdateCampaignOfferDTO {
    def toStringBody(var_offerId: Object, var_quantum: Object, var_available: Object, var_vat: Object) =
        s"""
        | {
        | "offerId":$var_offerId,"quantum":$var_quantum,"available":$var_available,"vat":$var_vat
        | }
        """.stripMargin
}

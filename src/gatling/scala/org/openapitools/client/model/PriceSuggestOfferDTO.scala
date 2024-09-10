
package org.openapitools.client.model


case class PriceSuggestOfferDTO (
    /* SKU на Маркете. */
    _marketSku: Option[Long],
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    _offerId: Option[String],
    /* Цены для продвижения.  */
    _priceSuggestion: Option[List[PriceSuggestDTO]]
)
object PriceSuggestOfferDTO {
    def toStringBody(var_marketSku: Object, var_offerId: Object, var_priceSuggestion: Object) =
        s"""
        | {
        | "marketSku":$var_marketSku,"offerId":$var_offerId,"priceSuggestion":$var_priceSuggestion
        | }
        """.stripMargin
}

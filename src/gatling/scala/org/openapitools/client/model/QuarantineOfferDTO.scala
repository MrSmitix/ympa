
package org.openapitools.client.model


case class QuarantineOfferDTO (
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    _offerId: Option[String],
    _currentPrice: Option[BasePriceDTO],
    _lastValidPrice: Option[BasePriceDTO],
    /* Причины попадания товара в карантин. */
    _verdicts: Option[List[PriceQuarantineVerdictDTO]]
)
object QuarantineOfferDTO {
    def toStringBody(var_offerId: Object, var_currentPrice: Object, var_lastValidPrice: Object, var_verdicts: Object) =
        s"""
        | {
        | "offerId":$var_offerId,"currentPrice":$var_currentPrice,"lastValidPrice":$var_lastValidPrice,"verdicts":$var_verdicts
        | }
        """.stripMargin
}

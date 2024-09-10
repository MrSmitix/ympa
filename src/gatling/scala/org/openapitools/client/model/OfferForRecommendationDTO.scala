
package org.openapitools.client.model


case class OfferForRecommendationDTO (
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    _offerId: Option[String],
    _price: Option[BasePriceDTO],
    _cofinancePrice: Option[GetPriceDTO],
    _competitiveness: Option[PriceCompetitivenessType],
    /* Количество показов карточки товара за последние 7 дней. */
    _shows: Option[Long]
)
object OfferForRecommendationDTO {
    def toStringBody(var_offerId: Object, var_price: Object, var_cofinancePrice: Object, var_competitiveness: Object, var_shows: Object) =
        s"""
        | {
        | "offerId":$var_offerId,"price":$var_price,"cofinancePrice":$var_cofinancePrice,"competitiveness":$var_competitiveness,"shows":$var_shows
        | }
        """.stripMargin
}

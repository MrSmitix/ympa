
package org.openapitools.client.model


case class SkuBidRecommendationItemDTO (
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    _sku: String,
    /* Значение ставки. */
    _bid: Integer,
    /* Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить.  */
    _bidRecommendations: Option[List[BidRecommendationItemDTO]],
    /* Рекомендованные цены. */
    _priceRecommendations: Option[List[PriceRecommendationItemDTO]]
)
object SkuBidRecommendationItemDTO {
    def toStringBody(var_sku: Object, var_bid: Object, var_bidRecommendations: Object, var_priceRecommendations: Object) =
        s"""
        | {
        | "sku":$var_sku,"bid":$var_bid,"bidRecommendations":$var_bidRecommendations,"priceRecommendations":$var_priceRecommendations
        | }
        """.stripMargin
}

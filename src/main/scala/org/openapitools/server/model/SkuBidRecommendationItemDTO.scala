package org.openapitools.server.model


/**
 * Список товаров с рекомендованными ставками.
 *
 * @param sku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  for example: ''null''
 * @param bid Значение ставки. for example: ''570''
 * @param bidRecommendations Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить.  for example: ''null''
 * @param priceRecommendations Рекомендованные цены. for example: ''null''
*/
final case class SkuBidRecommendationItemDTO (
  sku: String,
  bid: Int,
  bidRecommendations: Option[Seq[BidRecommendationItemDTO]] = None,
  priceRecommendations: Option[Seq[PriceRecommendationItemDTO]] = None
)


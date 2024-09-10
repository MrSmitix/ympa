goog.provide('API.Client.SkuBidRecommendationItemDTO');

/**
 * Список товаров с рекомендованными ставками.
 * @record
 */
API.Client.SkuBidRecommendationItemDTO = function() {}

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @type {!string}
 * @export
 */
API.Client.SkuBidRecommendationItemDTO.prototype.sku;

/**
 * Значение ставки.
 * @type {!number}
 * @export
 */
API.Client.SkuBidRecommendationItemDTO.prototype.bid;

/**
 * Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. 
 * @type {!Array<!API.Client.BidRecommendationItemDTO>}
 * @export
 */
API.Client.SkuBidRecommendationItemDTO.prototype.bidRecommendations;

/**
 * Рекомендованные цены.
 * @type {!Array<!API.Client.PriceRecommendationItemDTO>}
 * @export
 */
API.Client.SkuBidRecommendationItemDTO.prototype.priceRecommendations;


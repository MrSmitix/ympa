goog.provide('API.Client.OfferForRecommendationDTO');

/**
 * Информация о состоянии цены на товар.
 * @record
 */
API.Client.OfferForRecommendationDTO = function() {}

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @type {!string}
 * @export
 */
API.Client.OfferForRecommendationDTO.prototype.offerId;

/**
 * @type {!API.Client.BasePriceDTO}
 * @export
 */
API.Client.OfferForRecommendationDTO.prototype.price;

/**
 * @type {!API.Client.GetPriceDTO}
 * @export
 */
API.Client.OfferForRecommendationDTO.prototype.cofinancePrice;

/**
 * @type {!API.Client.PriceCompetitivenessType}
 * @export
 */
API.Client.OfferForRecommendationDTO.prototype.competitiveness;

/**
 * Количество показов карточки товара за последние 7 дней.
 * @type {!number}
 * @export
 */
API.Client.OfferForRecommendationDTO.prototype.shows;


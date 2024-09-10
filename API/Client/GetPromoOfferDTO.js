goog.provide('API.Client.GetPromoOfferDTO');

/**
 * Товар, который участвует или может участвовать в акции.
 * @record
 */
API.Client.GetPromoOfferDTO = function() {}

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @type {!string}
 * @export
 */
API.Client.GetPromoOfferDTO.prototype.offerId;

/**
 * @type {!API.Client.PromoOfferParticipationStatusType}
 * @export
 */
API.Client.GetPromoOfferDTO.prototype.status;

/**
 * @type {!API.Client.PromoOfferParamsDTO}
 * @export
 */
API.Client.GetPromoOfferDTO.prototype.params;

/**
 * @type {!API.Client.PromoOfferAutoParticipatingDetailsDTO}
 * @export
 */
API.Client.GetPromoOfferDTO.prototype.autoParticipatingDetails;


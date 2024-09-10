goog.provide('API.Client.WarningPromoOfferUpdateDTO');

/**
 * Описание предупреждения, которое появилось при добавлении товара.
 * @record
 */
API.Client.WarningPromoOfferUpdateDTO = function() {}

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @type {!string}
 * @export
 */
API.Client.WarningPromoOfferUpdateDTO.prototype.offerId;

/**
 * Предупреждения, которые появились при добавлении товара в акцию или изменении его цен.
 * @type {!Array<!API.Client.PromoOfferUpdateWarningDTO>}
 * @export
 */
API.Client.WarningPromoOfferUpdateDTO.prototype.warnings;


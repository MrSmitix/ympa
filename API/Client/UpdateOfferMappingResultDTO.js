goog.provide('API.Client.UpdateOfferMappingResultDTO');

/**
 * Ошибки и предупреждения, которые появились из-за переданных характеристик.
 * @record
 */
API.Client.UpdateOfferMappingResultDTO = function() {}

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @type {!string}
 * @export
 */
API.Client.UpdateOfferMappingResultDTO.prototype.offerId;

/**
 * Ошибки — информация в каталоге не обновится.
 * @type {!Array<!API.Client.OfferMappingErrorDTO>}
 * @export
 */
API.Client.UpdateOfferMappingResultDTO.prototype.errors;

/**
 * Предупреждения — информация в каталоге обновится.
 * @type {!Array<!API.Client.OfferMappingErrorDTO>}
 * @export
 */
API.Client.UpdateOfferMappingResultDTO.prototype.warnings;


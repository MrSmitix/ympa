goog.provide('API.Client.UpdateCampaignOfferDTO');

/**
 * Параметры размещения товара в магазине.
 * @record
 */
API.Client.UpdateCampaignOfferDTO = function() {}

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @type {!string}
 * @export
 */
API.Client.UpdateCampaignOfferDTO.prototype.offerId;

/**
 * @type {!API.Client.QuantumDTO}
 * @export
 */
API.Client.UpdateCampaignOfferDTO.prototype.quantum;

/**
 * Есть ли товар в продаже. 
 * @type {!boolean}
 * @export
 */
API.Client.UpdateCampaignOfferDTO.prototype.available;

/**
 * Ставка НДС, применяемая для товара. Задается цифрой:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете продавца на Маркете. 
 * @type {!number}
 * @export
 */
API.Client.UpdateCampaignOfferDTO.prototype.vat;


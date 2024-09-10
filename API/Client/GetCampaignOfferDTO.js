goog.provide('API.Client.GetCampaignOfferDTO');

/**
 * Параметры размещения товара в магазине.
 * @record
 */
API.Client.GetCampaignOfferDTO = function() {}

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @type {!string}
 * @export
 */
API.Client.GetCampaignOfferDTO.prototype.offerId;

/**
 * @type {!API.Client.QuantumDTO}
 * @export
 */
API.Client.GetCampaignOfferDTO.prototype.quantum;

/**
 * Есть ли товар в продаже. 
 * @type {!boolean}
 * @export
 */
API.Client.GetCampaignOfferDTO.prototype.available;

/**
 * @type {!API.Client.GetPriceWithDiscountDTO}
 * @export
 */
API.Client.GetCampaignOfferDTO.prototype.basicPrice;

/**
 * @type {!API.Client.GetPriceWithVatDTO}
 * @export
 */
API.Client.GetCampaignOfferDTO.prototype.campaignPrice;

/**
 * @type {!API.Client.OfferCampaignStatusType}
 * @export
 */
API.Client.GetCampaignOfferDTO.prototype.status;

/**
 * Ошибки, препятствующие размещению товара на витрине. 
 * @type {!Array<!API.Client.OfferErrorDTO>}
 * @export
 */
API.Client.GetCampaignOfferDTO.prototype.errors;

/**
 * Предупреждения, не препятствующие размещению товара на витрине. 
 * @type {!Array<!API.Client.OfferErrorDTO>}
 * @export
 */
API.Client.GetCampaignOfferDTO.prototype.warnings;


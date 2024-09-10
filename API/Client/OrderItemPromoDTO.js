goog.provide('API.Client.OrderItemPromoDTO');

/**
 * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 * @record
 */
API.Client.OrderItemPromoDTO = function() {}

/**
 * @type {!API.Client.OrderPromoType}
 * @export
 */
API.Client.OrderItemPromoDTO.prototype.type;

/**
 * Размер пользовательской скидки в валюте покупателя. 
 * @type {!number}
 * @export
 */
API.Client.OrderItemPromoDTO.prototype.discount;

/**
 * Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
 * @type {!number}
 * @export
 */
API.Client.OrderItemPromoDTO.prototype.subsidy;

/**
 * Идентификатор акции поставщика. 
 * @type {!string}
 * @export
 */
API.Client.OrderItemPromoDTO.prototype.shopPromoId;

/**
 * Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`. 
 * @type {!string}
 * @export
 */
API.Client.OrderItemPromoDTO.prototype.marketPromoId;


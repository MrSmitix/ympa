goog.provide('API.Client.OrderDTO');

/**
 * Заказ.
 * @record
 */
API.Client.OrderDTO = function() {}

/**
 * Идентификатор заказа.
 * @type {!number}
 * @export
 */
API.Client.OrderDTO.prototype.id;

/**
 * @type {!API.Client.OrderStatusType}
 * @export
 */
API.Client.OrderDTO.prototype.status;

/**
 * @type {!API.Client.OrderSubstatusType}
 * @export
 */
API.Client.OrderDTO.prototype.substatus;

/**
 * @type {!string}
 * @export
 */
API.Client.OrderDTO.prototype.creationDate;

/**
 * @type {!string}
 * @export
 */
API.Client.OrderDTO.prototype.updatedAt;

/**
 * @type {!API.Client.CurrencyType}
 * @export
 */
API.Client.OrderDTO.prototype.currency;

/**
 * Платеж покупателя. 
 * @type {!number}
 * @export
 */
API.Client.OrderDTO.prototype.itemsTotal;

/**
 * Стоимость доставки. 
 * @type {!number}
 * @export
 */
API.Client.OrderDTO.prototype.deliveryTotal;

/**
 * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
 * @type {!number}
 * @export
 */
API.Client.OrderDTO.prototype.buyerItemsTotal;

/**
 * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
 * @type {!number}
 * @export
 */
API.Client.OrderDTO.prototype.buyerTotal;

/**
 * Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
 * @type {!number}
 * @export
 */
API.Client.OrderDTO.prototype.buyerItemsTotalBeforeDiscount;

/**
 * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). 
 * @type {!number}
 * @export
 */
API.Client.OrderDTO.prototype.buyerTotalBeforeDiscount;

/**
 * @type {!API.Client.OrderPaymentType}
 * @export
 */
API.Client.OrderDTO.prototype.paymentType;

/**
 * @type {!API.Client.OrderPaymentMethodType}
 * @export
 */
API.Client.OrderDTO.prototype.paymentMethod;

/**
 * Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
 * @type {!boolean}
 * @export
 */
API.Client.OrderDTO.prototype.fake;

/**
 * Список товаров в заказе.
 * @type {!Array<!API.Client.OrderItemDTO>}
 * @export
 */
API.Client.OrderDTO.prototype.items;

/**
 * Список субсидий по типам.
 * @type {!Array<!API.Client.OrderSubsidyDTO>}
 * @export
 */
API.Client.OrderDTO.prototype.subsidies;

/**
 * @type {!API.Client.OrderDeliveryDTO}
 * @export
 */
API.Client.OrderDTO.prototype.delivery;

/**
 * @type {!API.Client.OrderBuyerDTO}
 * @export
 */
API.Client.OrderDTO.prototype.buyer;

/**
 * Комментарий к заказу.
 * @type {!string}
 * @export
 */
API.Client.OrderDTO.prototype.notes;

/**
 * @type {!API.Client.OrderTaxSystemType}
 * @export
 */
API.Client.OrderDTO.prototype.taxSystem;

/**
 * **Только для модели DBS**  Запрошена ли отмена. 
 * @type {!boolean}
 * @export
 */
API.Client.OrderDTO.prototype.cancelRequested;

/**
 * @type {!string}
 * @export
 */
API.Client.OrderDTO.prototype.expiryDate;


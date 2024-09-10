goog.provide('API.Client.OrdersStatsOrderDTO');

/**
 * Информация о заказе.
 * @record
 */
API.Client.OrdersStatsOrderDTO = function() {}

/**
 * Идентификатор заказа.
 * @type {!number}
 * @export
 */
API.Client.OrdersStatsOrderDTO.prototype.id;

/**
 * Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
 * @type {!API.Client.date}
 * @export
 */
API.Client.OrdersStatsOrderDTO.prototype.creationDate;

/**
 * Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). 
 * @type {!Date}
 * @export
 */
API.Client.OrdersStatsOrderDTO.prototype.statusUpdateDate;

/**
 * @type {!API.Client.OrderStatsStatusType}
 * @export
 */
API.Client.OrdersStatsOrderDTO.prototype.status;

/**
 * Идентификатор заказа в информационной системе магазина.
 * @type {!string}
 * @export
 */
API.Client.OrdersStatsOrderDTO.prototype.partnerOrderId;

/**
 * @type {!API.Client.OrdersStatsOrderPaymentType}
 * @export
 */
API.Client.OrdersStatsOrderDTO.prototype.paymentType;

/**
 * Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
 * @type {!boolean}
 * @export
 */
API.Client.OrdersStatsOrderDTO.prototype.fake;

/**
 * @type {!API.Client.OrdersStatsDeliveryRegionDTO}
 * @export
 */
API.Client.OrdersStatsOrderDTO.prototype.deliveryRegion;

/**
 * Список товаров в заказе после возможных изменений.
 * @type {!Array<!API.Client.OrdersStatsItemDTO>}
 * @export
 */
API.Client.OrdersStatsOrderDTO.prototype.items;

/**
 * Список товаров в заказе до изменений.
 * @type {!Array<!API.Client.OrdersStatsItemDTO>}
 * @export
 */
API.Client.OrdersStatsOrderDTO.prototype.initialItems;

/**
 * Информация о денежных переводах по заказу.
 * @type {!Array<!API.Client.OrdersStatsPaymentDTO>}
 * @export
 */
API.Client.OrdersStatsOrderDTO.prototype.payments;

/**
 * Информация о комиссиях за заказ.
 * @type {!Array<!API.Client.OrdersStatsCommissionDTO>}
 * @export
 */
API.Client.OrdersStatsOrderDTO.prototype.commissions;


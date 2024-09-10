goog.provide('API.Client.OrderItemDetailDTO');

/**
 * Детали по товару в заказе.
 * @record
 */
API.Client.OrderItemDetailDTO = function() {}

/**
 * Количество единиц товара.
 * @type {!number}
 * @export
 */
API.Client.OrderItemDetailDTO.prototype.itemCount;

/**
 * @type {!API.Client.OrderItemStatusType}
 * @export
 */
API.Client.OrderItemDetailDTO.prototype.itemStatus;

/**
 * Формат даты: `ДД-ММ-ГГГГ`. 
 * @type {!string}
 * @export
 */
API.Client.OrderItemDetailDTO.prototype.updateDate;


goog.provide('API.Client.OrderLabelDTO');

/**
 * Данные для печати ярлыка.
 * @record
 */
API.Client.OrderLabelDTO = function() {}

/**
 * Идентификатор заказа.
 * @type {!number}
 * @export
 */
API.Client.OrderLabelDTO.prototype.orderId;

/**
 * Количество коробок в заказе.
 * @type {!number}
 * @export
 */
API.Client.OrderLabelDTO.prototype.placesNumber;

/**
 * URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). 
 * @type {!string}
 * @export
 */
API.Client.OrderLabelDTO.prototype.url;

/**
 * Информация на ярлыке.
 * @type {!Array<!API.Client.ParcelBoxLabelDTO>}
 * @export
 */
API.Client.OrderLabelDTO.prototype.parcelBoxLabels;


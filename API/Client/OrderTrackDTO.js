goog.provide('API.Client.OrderTrackDTO');

/**
 * Информация о трек-номере посылки (DBS).
 * @record
 */
API.Client.OrderTrackDTO = function() {}

/**
 * Трек‑номер посылки.
 * @type {!string}
 * @export
 */
API.Client.OrderTrackDTO.prototype.trackCode;

/**
 * Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
 * @type {!number}
 * @export
 */
API.Client.OrderTrackDTO.prototype.deliveryServiceId;


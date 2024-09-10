goog.provide('API.Client.SetOrderDeliveryTrackCodeRequest');

/**
 * @record
 */
API.Client.SetOrderDeliveryTrackCodeRequest = function() {}

/**
 * Трек‑номер посылки.
 * @type {!string}
 * @export
 */
API.Client.SetOrderDeliveryTrackCodeRequest.prototype.trackCode;

/**
 * Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
 * @type {!number}
 * @export
 */
API.Client.SetOrderDeliveryTrackCodeRequest.prototype.deliveryServiceId;


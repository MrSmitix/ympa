goog.provide('API.Client.FeedbackOrderDTO');

/**
 * Информация о заказе, указанная в отзыве.
 * @record
 */
API.Client.FeedbackOrderDTO = function() {}

/**
 * Номер заказа, указанный в отзыве.
 * @type {!string}
 * @export
 */
API.Client.FeedbackOrderDTO.prototype.shopOrderId;

/**
 * @type {!API.Client.FeedbackDeliveryType}
 * @export
 */
API.Client.FeedbackOrderDTO.prototype.delivery;


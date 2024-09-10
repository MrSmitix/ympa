goog.provide('API.Client.GoodsFeedbackIdentifiersDTO');

/**
 * Идентификаторы, которые связаны с отзывом.
 * @record
 */
API.Client.GoodsFeedbackIdentifiersDTO = function() {}

/**
 * Идентификатор заказа на Маркете.
 * @type {!number}
 * @export
 */
API.Client.GoodsFeedbackIdentifiersDTO.prototype.orderId;

/**
 * Идентификатор модели товара.
 * @type {!number}
 * @export
 */
API.Client.GoodsFeedbackIdentifiersDTO.prototype.modelId;


goog.provide('API.Client.GoodsFeedbackDescriptionDTO');

/**
 * Текстовая часть отзыва.
 * @record
 */
API.Client.GoodsFeedbackDescriptionDTO = function() {}

/**
 * Описание плюсов товара в отзыве.
 * @type {!string}
 * @export
 */
API.Client.GoodsFeedbackDescriptionDTO.prototype.advantages;

/**
 * Описание минусов товара в отзыве.
 * @type {!string}
 * @export
 */
API.Client.GoodsFeedbackDescriptionDTO.prototype.disadvantages;

/**
 * Комментарий в отзыве.
 * @type {!string}
 * @export
 */
API.Client.GoodsFeedbackDescriptionDTO.prototype.comment;


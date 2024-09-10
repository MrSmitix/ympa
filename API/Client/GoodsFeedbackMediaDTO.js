goog.provide('API.Client.GoodsFeedbackMediaDTO');

/**
 * Фото и видео.
 * @record
 */
API.Client.GoodsFeedbackMediaDTO = function() {}

/**
 * Ссылки на фото.
 * @type {!Array<!string>}
 * @export
 */
API.Client.GoodsFeedbackMediaDTO.prototype.photos;

/**
 * Ссылки на видео.
 * @type {!Array<!string>}
 * @export
 */
API.Client.GoodsFeedbackMediaDTO.prototype.videos;


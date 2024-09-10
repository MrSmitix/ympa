goog.provide('API.Client.FeedbackAuthorDTO');

/**
 * Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. 
 * @record
 */
API.Client.FeedbackAuthorDTO = function() {}

/**
 * Имя автора отзыва.
 * @type {!string}
 * @export
 */
API.Client.FeedbackAuthorDTO.prototype.name;

/**
 * @type {!API.Client.RegionDTO}
 * @export
 */
API.Client.FeedbackAuthorDTO.prototype.region;


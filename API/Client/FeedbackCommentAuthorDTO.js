goog.provide('API.Client.FeedbackCommentAuthorDTO');

/**
 * Информация об авторе комментария.
 * @record
 */
API.Client.FeedbackCommentAuthorDTO = function() {}

/**
 * @type {!API.Client.FeedbackCommentAuthorType}
 * @export
 */
API.Client.FeedbackCommentAuthorDTO.prototype.type;

/**
 * Имя автора отзыва или название магазина.
 * @type {!string}
 * @export
 */
API.Client.FeedbackCommentAuthorDTO.prototype.name;


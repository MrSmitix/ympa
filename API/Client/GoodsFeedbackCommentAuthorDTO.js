goog.provide('API.Client.GoodsFeedbackCommentAuthorDTO');

/**
 * Информация об авторе комментария.
 * @record
 */
API.Client.GoodsFeedbackCommentAuthorDTO = function() {}

/**
 * @type {!API.Client.GoodsFeedbackCommentAuthorType}
 * @export
 */
API.Client.GoodsFeedbackCommentAuthorDTO.prototype.type;

/**
 * Имя автора или название кабинета.
 * @type {!string}
 * @export
 */
API.Client.GoodsFeedbackCommentAuthorDTO.prototype.name;


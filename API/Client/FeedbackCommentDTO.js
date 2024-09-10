goog.provide('API.Client.FeedbackCommentDTO');

/**
 * Комментарий к отзыву на магазин.
 * @record
 */
API.Client.FeedbackCommentDTO = function() {}

/**
 * Идентификатор ответа.
 * @type {!number}
 * @export
 */
API.Client.FeedbackCommentDTO.prototype.id;

/**
 * Идентификатор родительского ответа.
 * @type {!number}
 * @export
 */
API.Client.FeedbackCommentDTO.prototype.parentId;

/**
 * Текст ответа.
 * @type {!string}
 * @export
 */
API.Client.FeedbackCommentDTO.prototype.body;

/**
 * Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
 * @type {!Date}
 * @export
 */
API.Client.FeedbackCommentDTO.prototype.createdAt;

/**
 * Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
 * @type {!Date}
 * @export
 */
API.Client.FeedbackCommentDTO.prototype.updatedAt;

/**
 * @type {!API.Client.FeedbackCommentAuthorDTO}
 * @export
 */
API.Client.FeedbackCommentDTO.prototype.author;

/**
 * Дочерние ответы.
 * @type {!Array<!API.Client.FeedbackCommentDTO>}
 * @export
 */
API.Client.FeedbackCommentDTO.prototype.children;


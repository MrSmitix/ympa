goog.provide('API.Client.GoodsFeedbackCommentDTO');

/**
 * Комментарий к отзыву.
 * @record
 */
API.Client.GoodsFeedbackCommentDTO = function() {}

/**
 * Идентификатор комментария к отзыву. 
 * @type {!number}
 * @export
 */
API.Client.GoodsFeedbackCommentDTO.prototype.id;

/**
 * Текст комментария.
 * @type {!string}
 * @export
 */
API.Client.GoodsFeedbackCommentDTO.prototype.text;

/**
 * Может ли продавец изменять комментарий или удалять его.
 * @type {!boolean}
 * @export
 */
API.Client.GoodsFeedbackCommentDTO.prototype.canModify;

/**
 * Идентификатор комментария к отзыву. 
 * @type {!number}
 * @export
 */
API.Client.GoodsFeedbackCommentDTO.prototype.parentId;

/**
 * @type {!API.Client.GoodsFeedbackCommentAuthorDTO}
 * @export
 */
API.Client.GoodsFeedbackCommentDTO.prototype.author;

/**
 * @type {!API.Client.GoodsFeedbackCommentStatusType}
 * @export
 */
API.Client.GoodsFeedbackCommentDTO.prototype.status;


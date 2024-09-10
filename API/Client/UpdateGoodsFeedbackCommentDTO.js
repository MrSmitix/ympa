goog.provide('API.Client.UpdateGoodsFeedbackCommentDTO');

/**
 * Комментарий к отзыву или другому комментарию.
 * @record
 */
API.Client.UpdateGoodsFeedbackCommentDTO = function() {}

/**
 * Идентификатор комментария к отзыву. 
 * @type {!number}
 * @export
 */
API.Client.UpdateGoodsFeedbackCommentDTO.prototype.id;

/**
 * Идентификатор комментария к отзыву. 
 * @type {!number}
 * @export
 */
API.Client.UpdateGoodsFeedbackCommentDTO.prototype.parentId;

/**
 * Текст комментария.
 * @type {!string}
 * @export
 */
API.Client.UpdateGoodsFeedbackCommentDTO.prototype.text;


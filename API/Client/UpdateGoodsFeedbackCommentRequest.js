goog.provide('API.Client.UpdateGoodsFeedbackCommentRequest');

/**
 * Комментарий к отзыву.
 * @record
 */
API.Client.UpdateGoodsFeedbackCommentRequest = function() {}

/**
 * Идентификатор отзыва. 
 * @type {!number}
 * @export
 */
API.Client.UpdateGoodsFeedbackCommentRequest.prototype.feedbackId;

/**
 * @type {!API.Client.UpdateGoodsFeedbackCommentDTO}
 * @export
 */
API.Client.UpdateGoodsFeedbackCommentRequest.prototype.comment;


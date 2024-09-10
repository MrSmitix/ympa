goog.provide('API.Client.SkipGoodsFeedbackReactionRequest');

/**
 * Идентификаторы отзывов.
 * @record
 */
API.Client.SkipGoodsFeedbackReactionRequest = function() {}

/**
 * Список идентификаторов отзывов, на которые магазин не будет отвечать.
 * @type {!set<!number>}
 * @export
 */
API.Client.SkipGoodsFeedbackReactionRequest.prototype.feedbackIds;


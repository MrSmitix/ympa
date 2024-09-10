goog.provide('API.Client.GoodsFeedbackCommentListDTO');

/**
 * Комментарии к отзыву.
 * @record
 */
API.Client.GoodsFeedbackCommentListDTO = function() {}

/**
 * Список комментариев.
 * @type {!Array<!API.Client.GoodsFeedbackCommentDTO>}
 * @export
 */
API.Client.GoodsFeedbackCommentListDTO.prototype.comments;

/**
 * @type {!API.Client.ForwardScrollingPagerDTO}
 * @export
 */
API.Client.GoodsFeedbackCommentListDTO.prototype.paging;


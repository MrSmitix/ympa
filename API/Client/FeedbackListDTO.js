goog.provide('API.Client.FeedbackListDTO');

/**
 * Отзывы пользователей Яндекс Маркета об указанном магазине.
 * @record
 */
API.Client.FeedbackListDTO = function() {}

/**
 * @type {!API.Client.ScrollingPagerDTO}
 * @export
 */
API.Client.FeedbackListDTO.prototype.paging;

/**
 * Список отзывов.  Содержит не более 20 отзывов. 
 * @type {!Array<!API.Client.FeedbackDTO>}
 * @export
 */
API.Client.FeedbackListDTO.prototype.feedbackList;


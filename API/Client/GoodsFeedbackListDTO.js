goog.provide('API.Client.GoodsFeedbackListDTO');

/**
 * Список отзывов о товарах. 
 * @record
 */
API.Client.GoodsFeedbackListDTO = function() {}

/**
 * Список отзывов.
 * @type {!Array<!API.Client.GoodsFeedbackDTO>}
 * @export
 */
API.Client.GoodsFeedbackListDTO.prototype.feedbacks;

/**
 * @type {!API.Client.ForwardScrollingPagerDTO}
 * @export
 */
API.Client.GoodsFeedbackListDTO.prototype.paging;


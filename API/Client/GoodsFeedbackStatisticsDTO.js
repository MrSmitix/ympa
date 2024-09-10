goog.provide('API.Client.GoodsFeedbackStatisticsDTO');

/**
 * Статистическая информация по отзыву.
 * @record
 */
API.Client.GoodsFeedbackStatisticsDTO = function() {}

/**
 * Оценка товара.
 * @type {!number}
 * @export
 */
API.Client.GoodsFeedbackStatisticsDTO.prototype.rating;

/**
 * Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. 
 * @type {!number}
 * @export
 */
API.Client.GoodsFeedbackStatisticsDTO.prototype.commentsCount;

/**
 * Рекомендуют ли этот товар.
 * @type {!boolean}
 * @export
 */
API.Client.GoodsFeedbackStatisticsDTO.prototype.recommended;

/**
 * Количество баллов Плюса, которое автор получил за отзыв.
 * @type {!number}
 * @export
 */
API.Client.GoodsFeedbackStatisticsDTO.prototype.paidAmount;


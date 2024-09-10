goog.provide('API.Client.GoodsFeedbackDTO');

/**
 * Отзыв о товаре.
 * @record
 */
API.Client.GoodsFeedbackDTO = function() {}

/**
 * Идентификатор отзыва. 
 * @type {!number}
 * @export
 */
API.Client.GoodsFeedbackDTO.prototype.feedbackId;

/**
 * Дата и время создания отзыва.
 * @type {!Date}
 * @export
 */
API.Client.GoodsFeedbackDTO.prototype.createdAt;

/**
 * Нужен ли ответ на отзыв.
 * @type {!boolean}
 * @export
 */
API.Client.GoodsFeedbackDTO.prototype.needReaction;

/**
 * @type {!API.Client.GoodsFeedbackIdentifiersDTO}
 * @export
 */
API.Client.GoodsFeedbackDTO.prototype.identifiers;

/**
 * Имя автора отзыва.
 * @type {!string}
 * @export
 */
API.Client.GoodsFeedbackDTO.prototype.author;

/**
 * @type {!API.Client.GoodsFeedbackDescriptionDTO}
 * @export
 */
API.Client.GoodsFeedbackDTO.prototype.description;

/**
 * @type {!API.Client.GoodsFeedbackMediaDTO}
 * @export
 */
API.Client.GoodsFeedbackDTO.prototype.media;

/**
 * @type {!API.Client.GoodsFeedbackStatisticsDTO}
 * @export
 */
API.Client.GoodsFeedbackDTO.prototype.statistics;


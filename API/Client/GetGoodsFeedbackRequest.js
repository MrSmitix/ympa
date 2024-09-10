goog.provide('API.Client.GetGoodsFeedbackRequest');

/**
 * Фильтр запроса отзывов в кабинете. 
 * @record
 */
API.Client.GetGoodsFeedbackRequest = function() {}

/**
 * Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. 
 * @type {!Date}
 * @export
 */
API.Client.GetGoodsFeedbackRequest.prototype.dateTimeFrom;

/**
 * Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
 * @type {!Date}
 * @export
 */
API.Client.GetGoodsFeedbackRequest.prototype.dateTimeTo;

/**
 * @type {!API.Client.FeedbackReactionStatusType}
 * @export
 */
API.Client.GetGoodsFeedbackRequest.prototype.reactionStatus;

/**
 * Оценка товара.
 * @type {!set<!number>}
 * @export
 */
API.Client.GetGoodsFeedbackRequest.prototype.ratingValues;

/**
 * Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
 * @type {!set<!number>}
 * @export
 */
API.Client.GetGoodsFeedbackRequest.prototype.modelIds;

/**
 * Фильтр отзывов за баллы Плюса.
 * @type {!boolean}
 * @export
 */
API.Client.GetGoodsFeedbackRequest.prototype.paid;


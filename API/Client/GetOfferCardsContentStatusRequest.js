goog.provide('API.Client.GetOfferCardsContentStatusRequest');

/**
 * @record
 */
API.Client.GetOfferCardsContentStatusRequest = function() {}

/**
 * Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
 * @type {!set<!string>}
 * @export
 */
API.Client.GetOfferCardsContentStatusRequest.prototype.offerIds;

/**
 * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
 * @type {!set<!API.Client.OfferCardStatusType>}
 * @export
 */
API.Client.GetOfferCardsContentStatusRequest.prototype.cardStatuses;

/**
 * Фильтр по категориям на Маркете.
 * @type {!set<!number>}
 * @export
 */
API.Client.GetOfferCardsContentStatusRequest.prototype.categoryIds;


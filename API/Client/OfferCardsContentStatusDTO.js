goog.provide('API.Client.OfferCardsContentStatusDTO');

/**
 * Список товаров с информацией о состоянии карточек.
 * @record
 */
API.Client.OfferCardsContentStatusDTO = function() {}

/**
 * Страница списка товаров с информацией о состоянии карточек.
 * @type {!Array<!API.Client.OfferCardDTO>}
 * @export
 */
API.Client.OfferCardsContentStatusDTO.prototype.offerCards;

/**
 * @type {!API.Client.ForwardScrollingPagerDTO}
 * @export
 */
API.Client.OfferCardsContentStatusDTO.prototype.paging;


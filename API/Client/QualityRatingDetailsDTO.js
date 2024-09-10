goog.provide('API.Client.QualityRatingDetailsDTO');

/**
 * Информация о заказах, которые повлияли на индекс качества.
 * @record
 */
API.Client.QualityRatingDetailsDTO = function() {}

/**
 * Список заказов, которые повлияли на индекс качества.
 * @type {!Array<!API.Client.QualityRatingAffectedOrderDTO>}
 * @export
 */
API.Client.QualityRatingDetailsDTO.prototype.affectedOrders;


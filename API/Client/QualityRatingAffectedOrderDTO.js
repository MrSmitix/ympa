goog.provide('API.Client.QualityRatingAffectedOrderDTO');

/**
 * Информация о заказе, который повлиял на индекс качества.
 * @record
 */
API.Client.QualityRatingAffectedOrderDTO = function() {}

/**
 * Идентификатор заказа.
 * @type {!number}
 * @export
 */
API.Client.QualityRatingAffectedOrderDTO.prototype.orderId;

/**
 * Описание проблемы.
 * @type {!string}
 * @export
 */
API.Client.QualityRatingAffectedOrderDTO.prototype.description;

/**
 * @type {!API.Client.AffectedOrderQualityRatingComponentType}
 * @export
 */
API.Client.QualityRatingAffectedOrderDTO.prototype.componentType;


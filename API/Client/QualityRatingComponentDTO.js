goog.provide('API.Client.QualityRatingComponentDTO');

/**
 * Составляющая индекса качества.
 * @record
 */
API.Client.QualityRatingComponentDTO = function() {}

/**
 * Значение составляющей в процентах.
 * @type {!number}
 * @export
 */
API.Client.QualityRatingComponentDTO.prototype.value;

/**
 * @type {!API.Client.QualityRatingComponentType}
 * @export
 */
API.Client.QualityRatingComponentDTO.prototype.componentType;


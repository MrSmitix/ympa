goog.provide('API.Client.PriceCompetitivenessThresholdsDTO');

/**
 * Максимальные значения цены, при которых она является привлекательной или умеренной.
 * @record
 */
API.Client.PriceCompetitivenessThresholdsDTO = function() {}

/**
 * @type {!API.Client.BasePriceDTO}
 * @export
 */
API.Client.PriceCompetitivenessThresholdsDTO.prototype.optimalPrice;

/**
 * @type {!API.Client.BasePriceDTO}
 * @export
 */
API.Client.PriceCompetitivenessThresholdsDTO.prototype.averagePrice;


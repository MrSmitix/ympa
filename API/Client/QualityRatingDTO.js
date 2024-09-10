goog.provide('API.Client.QualityRatingDTO');

/**
 * Информация об индексе качества.
 * @record
 */
API.Client.QualityRatingDTO = function() {}

/**
 * Значение индекса качества.
 * @type {!number}
 * @export
 */
API.Client.QualityRatingDTO.prototype.rating;

/**
 * Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
 * @type {!API.Client.date}
 * @export
 */
API.Client.QualityRatingDTO.prototype.calculationDate;

/**
 * Составляющие индекса качества.
 * @type {!Array<!API.Client.QualityRatingComponentDTO>}
 * @export
 */
API.Client.QualityRatingDTO.prototype.components;


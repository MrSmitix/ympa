goog.provide('API.Client.MaxSaleQuantumDTO');

/**
 * Лимит на установку кванта и минимального количества товаров по категориям. 
 * @record
 */
API.Client.MaxSaleQuantumDTO = function() {}

/**
 * Идентификатор категории.
 * @type {!number}
 * @export
 */
API.Client.MaxSaleQuantumDTO.prototype.id;

/**
 * Название категории.
 * @type {!string}
 * @export
 */
API.Client.MaxSaleQuantumDTO.prototype.name;

/**
 * Лимит на установку кванта и минимального количества товаров.
 * @type {!number}
 * @export
 */
API.Client.MaxSaleQuantumDTO.prototype.maxSaleQuantum;


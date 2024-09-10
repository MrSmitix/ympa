goog.provide('API.Client.GetCategoriesMaxSaleQuantumDTO');

/**
 * Категории и лимит на установку кванта и минимального количества товаров.
 * @record
 */
API.Client.GetCategoriesMaxSaleQuantumDTO = function() {}

/**
 * Категории и лимит на установку кванта и минимального количества товаров.
 * @type {!Array<!API.Client.MaxSaleQuantumDTO>}
 * @export
 */
API.Client.GetCategoriesMaxSaleQuantumDTO.prototype.results;

/**
 * Ошибки, которые появились из-за переданных категорий.
 * @type {!Array<!API.Client.CategoryErrorDTO>}
 * @export
 */
API.Client.GetCategoriesMaxSaleQuantumDTO.prototype.errors;


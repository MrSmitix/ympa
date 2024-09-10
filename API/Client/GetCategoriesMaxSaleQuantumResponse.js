goog.provide('API.Client.GetCategoriesMaxSaleQuantumResponse');

/**
 * @record
 */
API.Client.GetCategoriesMaxSaleQuantumResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GetCategoriesMaxSaleQuantumResponse.prototype.status;

/**
 * Категории и лимит на установку кванта и минимального количества товаров.
 * @type {!Array<!API.Client.MaxSaleQuantumDTO>}
 * @export
 */
API.Client.GetCategoriesMaxSaleQuantumResponse.prototype.results;

/**
 * Ошибки, которые появились из-за переданных категорий.
 * @type {!Array<!API.Client.CategoryErrorDTO>}
 * @export
 */
API.Client.GetCategoriesMaxSaleQuantumResponse.prototype.errors;


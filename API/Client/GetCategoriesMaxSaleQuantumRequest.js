goog.provide('API.Client.GetCategoriesMaxSaleQuantumRequest');

/**
 * Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
 * @record
 */
API.Client.GetCategoriesMaxSaleQuantumRequest = function() {}

/**
 * Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.
 * @type {!set<!number>}
 * @export
 */
API.Client.GetCategoriesMaxSaleQuantumRequest.prototype.marketCategoryIds;


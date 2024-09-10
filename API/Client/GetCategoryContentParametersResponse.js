goog.provide('API.Client.GetCategoryContentParametersResponse');

/**
 * Ответ со списком характеристик для категории и их допустимыми значениями.
 * @record
 */
API.Client.GetCategoryContentParametersResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GetCategoryContentParametersResponse.prototype.status;

/**
 * @type {!API.Client.CategoryContentParametersDTO}
 * @export
 */
API.Client.GetCategoryContentParametersResponse.prototype.result;


goog.provide('API.Client.CategoryContentParametersDTO');

/**
 * Информация о параметрах категории.
 * @record
 */
API.Client.CategoryContentParametersDTO = function() {}

/**
 * Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
 * @type {!number}
 * @export
 */
API.Client.CategoryContentParametersDTO.prototype.categoryId;

/**
 * Список характеристик.
 * @type {!Array<!API.Client.CategoryParameterDTO>}
 * @export
 */
API.Client.CategoryContentParametersDTO.prototype.parameters;


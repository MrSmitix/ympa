goog.provide('API.Client.CategoryDTO');

/**
 * Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
 * @record
 */
API.Client.CategoryDTO = function() {}

/**
 * Идентификатор категории.
 * @type {!number}
 * @export
 */
API.Client.CategoryDTO.prototype.id;

/**
 * Название категории.
 * @type {!string}
 * @export
 */
API.Client.CategoryDTO.prototype.name;

/**
 * Дочерние категории.
 * @type {!Array<!API.Client.CategoryDTO>}
 * @export
 */
API.Client.CategoryDTO.prototype.children;


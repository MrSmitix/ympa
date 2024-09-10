goog.provide('API.Client.GetMappingDTO');

/**
 * Информация о товарах в каталоге. 
 * @record
 */
API.Client.GetMappingDTO = function() {}

/**
 * SKU на Маркете.
 * @type {!number}
 * @export
 */
API.Client.GetMappingDTO.prototype.marketSku;

/**
 * Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
 * @type {!string}
 * @export
 */
API.Client.GetMappingDTO.prototype.marketSkuName;

/**
 * Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
 * @type {!number}
 * @export
 */
API.Client.GetMappingDTO.prototype.marketModelId;

/**
 * Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
 * @type {!string}
 * @export
 */
API.Client.GetMappingDTO.prototype.marketModelName;

/**
 * Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
 * @type {!number}
 * @export
 */
API.Client.GetMappingDTO.prototype.marketCategoryId;

/**
 * Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
 * @type {!string}
 * @export
 */
API.Client.GetMappingDTO.prototype.marketCategoryName;


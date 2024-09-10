goog.provide('API.Client.UpdateMappingDTO');

/**
 * Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. 
 * @record
 */
API.Client.UpdateMappingDTO = function() {}

/**
 * SKU на Маркете.
 * @type {!number}
 * @export
 */
API.Client.UpdateMappingDTO.prototype.marketSku;


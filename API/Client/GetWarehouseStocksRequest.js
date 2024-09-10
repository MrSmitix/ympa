goog.provide('API.Client.GetWarehouseStocksRequest');

/**
 * Фильтры для запроса остатков. 
 * @record
 */
API.Client.GetWarehouseStocksRequest = function() {}

/**
 * **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`. 
 * @type {!boolean}
 * @export
 */
API.Client.GetWarehouseStocksRequest.prototype.withTurnover;

/**
 * Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращается информация о товарах, которые не находятся в архиве. 
 * @type {!boolean}
 * @export
 */
API.Client.GetWarehouseStocksRequest.prototype.archived;

/**
 * Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit` * `archived`  {% endnote %}    
 * @type {!set<!string>}
 * @export
 */
API.Client.GetWarehouseStocksRequest.prototype.offerIds;


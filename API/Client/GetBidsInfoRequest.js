goog.provide('API.Client.GetBidsInfoRequest');

/**
 * description.
 * @record
 */
API.Client.GetBidsInfoRequest = function() {}

/**
 * Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры `page_token` и `limit` игнорируются. 
 * @type {!Array<!string>}
 * @export
 */
API.Client.GetBidsInfoRequest.prototype.skus;


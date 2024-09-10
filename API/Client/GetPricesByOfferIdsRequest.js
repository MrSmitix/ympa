goog.provide('API.Client.GetPricesByOfferIdsRequest');

/**
 * Запрос списка цен.
 * @record
 */
API.Client.GetPricesByOfferIdsRequest = function() {}

/**
 * Список SKU.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
 * @type {!Array<!string>}
 * @export
 */
API.Client.GetPricesByOfferIdsRequest.prototype.offerIds;


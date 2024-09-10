goog.provide('API.Client.PutSkuBidsRequest');

/**
 * description.
 * @record
 */
API.Client.PutSkuBidsRequest = function() {}

/**
 * Список товаров и ставки для продвижения, которые на них нужно установить.
 * @type {!Array<!API.Client.SkuBidItemDTO>}
 * @export
 */
API.Client.PutSkuBidsRequest.prototype.bids;


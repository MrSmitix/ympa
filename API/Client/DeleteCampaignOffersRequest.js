goog.provide('API.Client.DeleteCampaignOffersRequest');

/**
 * Фильтрации удаляемых товаров по offerIds. 
 * @record
 */
API.Client.DeleteCampaignOffersRequest = function() {}

/**
 * Идентификаторы товаров в каталоге.
 * @type {!Array<!string>}
 * @export
 */
API.Client.DeleteCampaignOffersRequest.prototype.offerIds;


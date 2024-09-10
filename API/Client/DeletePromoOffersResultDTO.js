goog.provide('API.Client.DeletePromoOffersResultDTO');

/**
 * Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр `offerIds`. 
 * @record
 */
API.Client.DeletePromoOffersResultDTO = function() {}

/**
 * Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
 * @type {!Array<!API.Client.RejectedPromoOfferDeleteDTO>}
 * @export
 */
API.Client.DeletePromoOffersResultDTO.prototype.rejectedOffers;


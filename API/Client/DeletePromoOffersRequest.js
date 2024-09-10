goog.provide('API.Client.DeletePromoOffersRequest');

/**
 * Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение `true` в параметре `deleteAllOffers`;  * часть товаров, передайте их идентификаторы в параметре `offersIds`. 
 * @record
 */
API.Client.DeletePromoOffersRequest = function() {}

/**
 * Идентификатор акции.
 * @type {!string}
 * @export
 */
API.Client.DeletePromoOffersRequest.prototype.promoId;

/**
 * Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`.
 * @type {!boolean}
 * @export
 */
API.Client.DeletePromoOffersRequest.prototype.deleteAllOffers;

/**
 * Товары, которые нужно убрать из акции.
 * @type {!Array<!string>}
 * @export
 */
API.Client.DeletePromoOffersRequest.prototype.offerIds;


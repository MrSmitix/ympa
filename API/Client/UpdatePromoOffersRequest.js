goog.provide('API.Client.UpdatePromoOffersRequest');

/**
 * Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`. 
 * @record
 */
API.Client.UpdatePromoOffersRequest = function() {}

/**
 * Идентификатор акции.
 * @type {!string}
 * @export
 */
API.Client.UpdatePromoOffersRequest.prototype.promoId;

/**
 * Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
 * @type {!Array<!API.Client.UpdatePromoOfferDTO>}
 * @export
 */
API.Client.UpdatePromoOffersRequest.prototype.offers;


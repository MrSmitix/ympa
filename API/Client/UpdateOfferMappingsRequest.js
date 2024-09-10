goog.provide('API.Client.UpdateOfferMappingsRequest');

/**
 * @record
 */
API.Client.UpdateOfferMappingsRequest = function() {}

/**
 * Перечень товаров, которые нужно добавить или обновить.
 * @type {!Array<!API.Client.UpdateOfferMappingDTO>}
 * @export
 */
API.Client.UpdateOfferMappingsRequest.prototype.offerMappings;

/**
 * Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`. 
 * @type {!boolean}
 * @export
 */
API.Client.UpdateOfferMappingsRequest.prototype.onlyPartnerMediaContent;


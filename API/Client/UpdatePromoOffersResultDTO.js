goog.provide('API.Client.UpdatePromoOffersResultDTO');

/**
 * Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
 * @record
 */
API.Client.UpdatePromoOffersResultDTO = function() {}

/**
 * Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
 * @type {!Array<!API.Client.RejectedPromoOfferUpdateDTO>}
 * @export
 */
API.Client.UpdatePromoOffersResultDTO.prototype.rejectedOffers;

/**
 * Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
 * @type {!Array<!API.Client.WarningPromoOfferUpdateDTO>}
 * @export
 */
API.Client.UpdatePromoOffersResultDTO.prototype.warningOffers;


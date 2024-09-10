goog.provide('API.Client.GetPromoAssortmentInfoDTO');

/**
 * Информация о товарах в акции.
 * @record
 */
API.Client.GetPromoAssortmentInfoDTO = function() {}

/**
 * Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 * @type {!number}
 * @export
 */
API.Client.GetPromoAssortmentInfoDTO.prototype.activeOffers;

/**
 * Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. 
 * @type {!number}
 * @export
 */
API.Client.GetPromoAssortmentInfoDTO.prototype.potentialOffers;

/**
 * Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. 
 * @type {!boolean}
 * @export
 */
API.Client.GetPromoAssortmentInfoDTO.prototype.processing;


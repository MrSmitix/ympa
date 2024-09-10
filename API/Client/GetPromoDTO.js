goog.provide('API.Client.GetPromoDTO');

/**
 * Информация об акции.
 * @record
 */
API.Client.GetPromoDTO = function() {}

/**
 * Идентификатор акции.
 * @type {!string}
 * @export
 */
API.Client.GetPromoDTO.prototype.id;

/**
 * Название акции.
 * @type {!string}
 * @export
 */
API.Client.GetPromoDTO.prototype.name;

/**
 * @type {!API.Client.PromoPeriodDTO}
 * @export
 */
API.Client.GetPromoDTO.prototype.period;

/**
 * Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 * @type {!boolean}
 * @export
 */
API.Client.GetPromoDTO.prototype.participating;

/**
 * @type {!API.Client.GetPromoAssortmentInfoDTO}
 * @export
 */
API.Client.GetPromoDTO.prototype.assortmentInfo;

/**
 * @type {!API.Client.GetPromoMechanicsInfoDTO}
 * @export
 */
API.Client.GetPromoDTO.prototype.mechanicsInfo;

/**
 * @type {!API.Client.GetPromoBestsellerInfoDTO}
 * @export
 */
API.Client.GetPromoDTO.prototype.bestsellerInfo;

/**
 * Список каналов продвижения товаров.
 * @type {!Array<!API.Client.ChannelType>}
 * @export
 */
API.Client.GetPromoDTO.prototype.channels;

/**
 * @type {!API.Client.GetPromoConstraintsDTO}
 * @export
 */
API.Client.GetPromoDTO.prototype.constraints;


goog.provide('API.Client.ModelOfferDTO');

/**
 * Информация о предложении.
 * @record
 */
API.Client.ModelOfferDTO = function() {}

/**
 * Скидка на предложение в процентах.
 * @type {!number}
 * @export
 */
API.Client.ModelOfferDTO.prototype.discount;

/**
 * Наименование предложения.
 * @type {!string}
 * @export
 */
API.Client.ModelOfferDTO.prototype.name;

/**
 * Позиция предложения в выдаче Маркета на карточке модели.
 * @type {!number}
 * @export
 */
API.Client.ModelOfferDTO.prototype.pos;

/**
 * Цена предложения без скидки магазина.
 * @type {!number}
 * @export
 */
API.Client.ModelOfferDTO.prototype.preDiscountPrice;

/**
 * Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
 * @type {!number}
 * @export
 */
API.Client.ModelOfferDTO.prototype.price;

/**
 * Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. 
 * @type {!number}
 * @export
 */
API.Client.ModelOfferDTO.prototype.regionId;

/**
 * Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
 * @type {!number}
 * @export
 */
API.Client.ModelOfferDTO.prototype.shippingCost;

/**
 * Название магазина (в том виде, в котором отображается на Маркете).
 * @type {!string}
 * @export
 */
API.Client.ModelOfferDTO.prototype.shopName;

/**
 * Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. 
 * @type {!number}
 * @export
 */
API.Client.ModelOfferDTO.prototype.shopRating;

/**
 * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
 * @type {!number}
 * @export
 */
API.Client.ModelOfferDTO.prototype.inStock;


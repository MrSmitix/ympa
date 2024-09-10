goog.provide('API.Client.OfferDTO');

/**
 * Предложение.
 * @record
 */
API.Client.OfferDTO = function() {}

/**
 * Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. 
 * @type {!number}
 * @export
 */
API.Client.OfferDTO.prototype.price;

/**
 * Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. 
 * @type {!number}
 * @export
 */
API.Client.OfferDTO.prototype.feedId;

/**
 * Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. 
 * @type {!string}
 * @export
 */
API.Client.OfferDTO.prototype.id;

/**
 * Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. 
 * @type {!string}
 * @export
 */
API.Client.OfferDTO.prototype.shopCategoryId;

/**
 * Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. 
 * @type {!number}
 * @export
 */
API.Client.OfferDTO.prototype.marketCategoryId;

/**
 * Цена предложения без скидки.
 * @type {!number}
 * @export
 */
API.Client.OfferDTO.prototype.preDiscountPrice;

/**
 * Скидка на предложение в процентах.
 * @type {!number}
 * @export
 */
API.Client.OfferDTO.prototype.discount;

/**
 * Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. 
 * @type {!boolean}
 * @export
 */
API.Client.OfferDTO.prototype.cutPrice;

/**
 * URL-адрес предложения на сайте магазина.
 * @type {!string}
 * @export
 */
API.Client.OfferDTO.prototype.url;

/**
 * Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %} 
 * @type {!number}
 * @export
 */
API.Client.OfferDTO.prototype.modelId;

/**
 * Наименование предложения.
 * @type {!string}
 * @export
 */
API.Client.OfferDTO.prototype.name;

/**
 * @type {!API.Client.CurrencyType}
 * @export
 */
API.Client.OfferDTO.prototype.currency;

/**
 * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
 * @type {!number}
 * @export
 */
API.Client.OfferDTO.prototype.bid;

/**
 * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
 * @type {!number}
 * @export
 */
API.Client.OfferDTO.prototype.cbid;

/**
 * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. 
 * @type {!number}
 * @export
 */
API.Client.OfferDTO.prototype.fee;

/**
 * Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. 
 * @type {!boolean}
 * @export
 */
API.Client.OfferDTO.prototype.blocked;


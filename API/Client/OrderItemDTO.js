goog.provide('API.Client.OrderItemDTO');

/**
 * Список товаров в заказе.
 * @record
 */
API.Client.OrderItemDTO = function() {}

/**
 * Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
 * @type {!number}
 * @export
 */
API.Client.OrderItemDTO.prototype.id;

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @type {!string}
 * @export
 */
API.Client.OrderItemDTO.prototype.offerId;

/**
 * Название товара.
 * @type {!string}
 * @export
 */
API.Client.OrderItemDTO.prototype.offerName;

/**
 * Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`). 
 * @type {!number}
 * @export
 */
API.Client.OrderItemDTO.prototype.price;

/**
 * Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. 
 * @type {!number}
 * @export
 */
API.Client.OrderItemDTO.prototype.buyerPrice;

/**
 * Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. 
 * @type {!number}
 * @export
 */
API.Client.OrderItemDTO.prototype.buyerPriceBeforeDiscount;

/**
 * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. 
 * @type {!number}
 * @export
 */
API.Client.OrderItemDTO.prototype.priceBeforeDiscount;

/**
 * Количество единиц товара.
 * @type {!number}
 * @export
 */
API.Client.OrderItemDTO.prototype.count;

/**
 * @type {!API.Client.OrderVatType}
 * @export
 */
API.Client.OrderItemDTO.prototype.vat;

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @type {!string}
 * @export
 */
API.Client.OrderItemDTO.prototype.shopSku;

/**
 * {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. 
 * @type {!number}
 * @export
 */
API.Client.OrderItemDTO.prototype.subsidy;

/**
 * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. 
 * @type {!string}
 * @export
 */
API.Client.OrderItemDTO.prototype.partnerWarehouseId;

/**
 * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 * @type {!Array<!API.Client.OrderItemPromoDTO>}
 * @export
 */
API.Client.OrderItemDTO.prototype.promos;

/**
 * Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует. 
 * @type {!Array<!API.Client.OrderItemInstanceDTO>}
 * @export
 */
API.Client.OrderItemDTO.prototype.instances;

/**
 * Информация об удалении товара из заказа. 
 * @type {!Array<!API.Client.OrderItemDetailDTO>}
 * @export
 */
API.Client.OrderItemDTO.prototype.details;

/**
 * Список субсидий по типам.
 * @type {!Array<!API.Client.OrderItemSubsidyDTO>}
 * @export
 */
API.Client.OrderItemDTO.prototype.subsidies;

/**
 * Список необходимых маркировок товара.
 * @type {!Array<!API.Client.OrderItemInstanceType>}
 * @export
 */
API.Client.OrderItemDTO.prototype.requiredInstanceTypes;


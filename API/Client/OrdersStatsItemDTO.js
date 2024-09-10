goog.provide('API.Client.OrdersStatsItemDTO');

/**
 * Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке `items` — только в списке `initialItems`.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке `items` (с уменьшенным количеством единиц `count`), и в списке `initialItems` (с первоначальным количеством единиц `initialCount`). 
 * @record
 */
API.Client.OrdersStatsItemDTO = function() {}

/**
 * Название товара.
 * @type {!string}
 * @export
 */
API.Client.OrdersStatsItemDTO.prototype.offerName;

/**
 * SKU на Маркете.
 * @type {!number}
 * @export
 */
API.Client.OrdersStatsItemDTO.prototype.marketSku;

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @type {!string}
 * @export
 */
API.Client.OrdersStatsItemDTO.prototype.shopSku;

/**
 * Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`. 
 * @type {!number}
 * @export
 */
API.Client.OrdersStatsItemDTO.prototype.count;

/**
 * Цена или скидки на товар.
 * @type {!Array<!API.Client.OrdersStatsPriceDTO>}
 * @export
 */
API.Client.OrdersStatsItemDTO.prototype.prices;

/**
 * @type {!API.Client.OrdersStatsWarehouseDTO}
 * @export
 */
API.Client.OrdersStatsItemDTO.prototype.warehouse;

/**
 * Информация об удалении товара из заказа.
 * @type {!Array<!API.Client.OrdersStatsDetailsDTO>}
 * @export
 */
API.Client.OrdersStatsItemDTO.prototype.details;

/**
 * Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
 * @type {!Array<!string>}
 * @export
 */
API.Client.OrdersStatsItemDTO.prototype.cisList;

/**
 * Первоначальное количество единиц товара.
 * @type {!number}
 * @export
 */
API.Client.OrdersStatsItemDTO.prototype.initialCount;

/**
 * Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. 
 * @type {!number}
 * @export
 */
API.Client.OrdersStatsItemDTO.prototype.bidFee;

/**
 * Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. 
 * @type {!number}
 * @export
 */
API.Client.OrdersStatsItemDTO.prototype.cofinanceThreshold;

/**
 * Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. 
 * @type {!number}
 * @export
 */
API.Client.OrdersStatsItemDTO.prototype.cofinanceValue;


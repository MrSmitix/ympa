goog.provide('API.Client.OrdersStatsPriceDTO');

/**
 * Цена или скидки на товар.
 * @record
 */
API.Client.OrdersStatsPriceDTO = function() {}

/**
 * @type {!API.Client.OrdersStatsPriceType}
 * @export
 */
API.Client.OrdersStatsPriceDTO.prototype.type;

/**
 * Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. 
 * @type {!number}
 * @export
 */
API.Client.OrdersStatsPriceDTO.prototype.costPerItem;

/**
 * Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. 
 * @type {!number}
 * @export
 */
API.Client.OrdersStatsPriceDTO.prototype.total;


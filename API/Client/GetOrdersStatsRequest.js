goog.provide('API.Client.GetOrdersStatsRequest');

/**
 * Запрос информации по заказам.
 * @record
 */
API.Client.GetOrdersStatsRequest = function() {}

/**
 * Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
 * @type {!API.Client.date}
 * @export
 */
API.Client.GetOrdersStatsRequest.prototype.dateFrom;

/**
 * Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
 * @type {!API.Client.date}
 * @export
 */
API.Client.GetOrdersStatsRequest.prototype.dateTo;

/**
 * Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
 * @type {!API.Client.date}
 * @export
 */
API.Client.GetOrdersStatsRequest.prototype.updateFrom;

/**
 * Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
 * @type {!API.Client.date}
 * @export
 */
API.Client.GetOrdersStatsRequest.prototype.updateTo;

/**
 * Список идентификаторов заказов.
 * @type {!Array<!number>}
 * @export
 */
API.Client.GetOrdersStatsRequest.prototype.orders;

/**
 * Список статусов заказов.
 * @type {!Array<!API.Client.OrderStatsStatusType>}
 * @export
 */
API.Client.GetOrdersStatsRequest.prototype.statuses;

/**
 * Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
 * @type {!boolean}
 * @export
 */
API.Client.GetOrdersStatsRequest.prototype.hasCis;


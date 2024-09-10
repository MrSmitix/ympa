goog.provide('API.Client.OrdersStatsDetailsDTO');

/**
 * Информация об удалении товара из заказа.
 * @record
 */
API.Client.OrdersStatsDetailsDTO = function() {}

/**
 * @type {!API.Client.OrdersStatsItemStatusType}
 * @export
 */
API.Client.OrdersStatsDetailsDTO.prototype.itemStatus;

/**
 * Количество товара со статусом, указанном в параметре `itemStatus`.
 * @type {!number}
 * @export
 */
API.Client.OrdersStatsDetailsDTO.prototype.itemCount;

/**
 * Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. 
 * @type {!API.Client.date}
 * @export
 */
API.Client.OrdersStatsDetailsDTO.prototype.updateDate;

/**
 * @type {!API.Client.OrdersStatsStockType}
 * @export
 */
API.Client.OrdersStatsDetailsDTO.prototype.stockType;


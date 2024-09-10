goog.provide('API.Client.SearchShipmentsRequest');

/**
 * Запрос информации об отгрузках.
 * @record
 */
API.Client.SearchShipmentsRequest = function() {}

/**
 * Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
 * @type {!API.Client.date}
 * @export
 */
API.Client.SearchShipmentsRequest.prototype.dateFrom;

/**
 * Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
 * @type {!API.Client.date}
 * @export
 */
API.Client.SearchShipmentsRequest.prototype.dateTo;

/**
 * Список статусов отгрузок.
 * @type {!set<!API.Client.ShipmentStatusType>}
 * @export
 */
API.Client.SearchShipmentsRequest.prototype.statuses;

/**
 * Список идентификаторов заказов из отгрузок.
 * @type {!set<!number>}
 * @export
 */
API.Client.SearchShipmentsRequest.prototype.orderIds;

/**
 * Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. 
 * @type {!boolean}
 * @export
 */
API.Client.SearchShipmentsRequest.prototype.cancelledOrders;


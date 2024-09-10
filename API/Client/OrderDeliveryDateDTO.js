goog.provide('API.Client.OrderDeliveryDateDTO');

/**
 * Информация о новой дате доставки заказа.
 * @record
 */
API.Client.OrderDeliveryDateDTO = function() {}

/**
 * Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
 * @type {!API.Client.date}
 * @export
 */
API.Client.OrderDeliveryDateDTO.prototype.toDate;


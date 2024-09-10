goog.provide('API.Client.UpdateOrderStorageLimitRequest');

/**
 * Запрос на обновление срока хранения заказа в ПВЗ.
 * @record
 */
API.Client.UpdateOrderStorageLimitRequest = function() {}

/**
 * Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: `ГГГГ-ММ-ДД`. 
 * @type {!API.Client.date}
 * @export
 */
API.Client.UpdateOrderStorageLimitRequest.prototype.newDate;


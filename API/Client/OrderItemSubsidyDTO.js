goog.provide('API.Client.OrderItemSubsidyDTO');

/**
 * Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 
 * @record
 */
API.Client.OrderItemSubsidyDTO = function() {}

/**
 * @type {!API.Client.OrderItemSubsidyType}
 * @export
 */
API.Client.OrderItemSubsidyDTO.prototype.type;

/**
 * Сумма субсидии.
 * @type {!number}
 * @export
 */
API.Client.OrderItemSubsidyDTO.prototype.amount;


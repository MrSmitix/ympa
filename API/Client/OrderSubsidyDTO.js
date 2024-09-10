goog.provide('API.Client.OrderSubsidyDTO');

/**
 * Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 
 * @record
 */
API.Client.OrderSubsidyDTO = function() {}

/**
 * @type {!API.Client.OrderSubsidyType}
 * @export
 */
API.Client.OrderSubsidyDTO.prototype.type;

/**
 * Сумма субсидии.
 * @type {!number}
 * @export
 */
API.Client.OrderSubsidyDTO.prototype.amount;


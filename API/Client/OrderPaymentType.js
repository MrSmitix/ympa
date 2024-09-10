goog.provide('API.Client.OrderPaymentType');

/**
 * Тип оплаты заказа:  * `PREPAID` — оплата при оформлении заказа.  * `POSTPAID` — оплата при получении заказа.  * `UNKNOWN` — неизвестный тип.  Если параметр отсутствует, заказ будет оплачен при получении. 
 * @record
 */
API.Client.OrderPaymentType = function() {}


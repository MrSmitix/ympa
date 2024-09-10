goog.provide('API.Client.EacVerificationStatusType');

/**
 * Статус проверки кода подтверждения:  * `ACCEPTED` — код верный. * `REJECTED` — код неверный. * `NEED_UPDATE` — Маркет отправит новый код. Значение возвращается, если превышено количество попыток отправки кода. 
 * @record
 */
API.Client.EacVerificationStatusType = function() {}


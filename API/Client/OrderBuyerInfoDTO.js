goog.provide('API.Client.OrderBuyerInfoDTO');

/**
 * Информация о покупателе и его номере телефона.
 * @record
 */
API.Client.OrderBuyerInfoDTO = function() {}

/**
 * Идентификатор покупателя.
 * @type {!string}
 * @export
 */
API.Client.OrderBuyerInfoDTO.prototype.id;

/**
 * Фамилия покупателя.
 * @type {!string}
 * @export
 */
API.Client.OrderBuyerInfoDTO.prototype.lastName;

/**
 * Имя покупателя.
 * @type {!string}
 * @export
 */
API.Client.OrderBuyerInfoDTO.prototype.firstName;

/**
 * Отчество покупателя.
 * @type {!string}
 * @export
 */
API.Client.OrderBuyerInfoDTO.prototype.middleName;

/**
 * @type {!API.Client.OrderBuyerType}
 * @export
 */
API.Client.OrderBuyerInfoDTO.prototype.type;

/**
 * Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`. 
 * @type {!string}
 * @export
 */
API.Client.OrderBuyerInfoDTO.prototype.phone;


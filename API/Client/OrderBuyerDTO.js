goog.provide('API.Client.OrderBuyerDTO');

/**
 * Информация о покупателе.  Параметры `id`, `lastName`, `firstName` и `middleName` возвращаются, только если вы работаете по модели DBS. 
 * @record
 */
API.Client.OrderBuyerDTO = function() {}

/**
 * Идентификатор покупателя.
 * @type {!string}
 * @export
 */
API.Client.OrderBuyerDTO.prototype.id;

/**
 * Фамилия покупателя.
 * @type {!string}
 * @export
 */
API.Client.OrderBuyerDTO.prototype.lastName;

/**
 * Имя покупателя.
 * @type {!string}
 * @export
 */
API.Client.OrderBuyerDTO.prototype.firstName;

/**
 * Отчество покупателя.
 * @type {!string}
 * @export
 */
API.Client.OrderBuyerDTO.prototype.middleName;

/**
 * @type {!API.Client.OrderBuyerType}
 * @export
 */
API.Client.OrderBuyerDTO.prototype.type;


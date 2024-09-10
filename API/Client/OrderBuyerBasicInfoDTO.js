goog.provide('API.Client.OrderBuyerBasicInfoDTO');

/**
 * Информация о покупателе с базовыми полями.
 * @record
 */
API.Client.OrderBuyerBasicInfoDTO = function() {}

/**
 * Идентификатор покупателя.
 * @type {!string}
 * @export
 */
API.Client.OrderBuyerBasicInfoDTO.prototype.id;

/**
 * Фамилия покупателя.
 * @type {!string}
 * @export
 */
API.Client.OrderBuyerBasicInfoDTO.prototype.lastName;

/**
 * Имя покупателя.
 * @type {!string}
 * @export
 */
API.Client.OrderBuyerBasicInfoDTO.prototype.firstName;

/**
 * Отчество покупателя.
 * @type {!string}
 * @export
 */
API.Client.OrderBuyerBasicInfoDTO.prototype.middleName;

/**
 * @type {!API.Client.OrderBuyerType}
 * @export
 */
API.Client.OrderBuyerBasicInfoDTO.prototype.type;


goog.provide('API.Client.OrderBusinessBuyerDTO');

/**
 * Информация о покупателе. 
 * @record
 */
API.Client.OrderBusinessBuyerDTO = function() {}

/**
 * ИНН.
 * @type {!string}
 * @export
 */
API.Client.OrderBusinessBuyerDTO.prototype.inn;

/**
 * КПП.
 * @type {!string}
 * @export
 */
API.Client.OrderBusinessBuyerDTO.prototype.kpp;

/**
 * Наименование юридического лица.
 * @type {!string}
 * @export
 */
API.Client.OrderBusinessBuyerDTO.prototype.organizationName;

/**
 * Юридический адрес.
 * @type {!string}
 * @export
 */
API.Client.OrderBusinessBuyerDTO.prototype.organizationJurAddress;


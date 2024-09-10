goog.provide('API.Client.PalletsCountDTO');

/**
 * Количество палет в отгрузке.
 * @record
 */
API.Client.PalletsCountDTO = function() {}

/**
 * Количество палет, которое заявил продавец.
 * @type {!number}
 * @export
 */
API.Client.PalletsCountDTO.prototype.planned;

/**
 * Количество палет, которое приняли в сортировочном центре.
 * @type {!number}
 * @export
 */
API.Client.PalletsCountDTO.prototype.fact;


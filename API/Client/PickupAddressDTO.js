goog.provide('API.Client.PickupAddressDTO');

/**
 * Адрес доставки.
 * @record
 */
API.Client.PickupAddressDTO = function() {}

/**
 * Страна.
 * @type {!string}
 * @export
 */
API.Client.PickupAddressDTO.prototype.country;

/**
 * Город.
 * @type {!string}
 * @export
 */
API.Client.PickupAddressDTO.prototype.city;

/**
 * Улица.
 * @type {!string}
 * @export
 */
API.Client.PickupAddressDTO.prototype.street;

/**
 * Номер дома.
 * @type {!string}
 * @export
 */
API.Client.PickupAddressDTO.prototype.house;

/**
 * Почтовый индекс.
 * @type {!string}
 * @export
 */
API.Client.PickupAddressDTO.prototype.postcode;


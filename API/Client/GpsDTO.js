goog.provide('API.Client.GpsDTO');

/**
 * GPS-координаты широты и долготы. 
 * @record
 */
API.Client.GpsDTO = function() {}

/**
 * Широта.
 * @type {!number}
 * @export
 */
API.Client.GpsDTO.prototype.latitude;

/**
 * Долгота.
 * @type {!number}
 * @export
 */
API.Client.GpsDTO.prototype.longitude;


goog.provide('API.Client.UpdateOutletLicenseRequest');

/**
 * Запрос на создание или изменение лицензий для точек продаж.
 * @record
 */
API.Client.UpdateOutletLicenseRequest = function() {}

/**
 * Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. 
 * @type {!Array<!API.Client.OutletLicenseDTO>}
 * @export
 */
API.Client.UpdateOutletLicenseRequest.prototype.licenses;


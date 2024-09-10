goog.provide('API.Client.OutletLicensesResponseDTO');

/**
 * Ответ на запрос информации о лицензиях для точек продаж.
 * @record
 */
API.Client.OutletLicensesResponseDTO = function() {}

/**
 * Список лицензий.
 * @type {!Array<!API.Client.FullOutletLicenseDTO>}
 * @export
 */
API.Client.OutletLicensesResponseDTO.prototype.licenses;


goog.provide('API.Client.CreateOutletResponse');

/**
 * Ответ на запрос о создании точки продаж.
 * @record
 */
API.Client.CreateOutletResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.CreateOutletResponse.prototype.status;

/**
 * @type {!API.Client.OutletResponseDTO}
 * @export
 */
API.Client.CreateOutletResponse.prototype.result;


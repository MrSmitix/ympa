goog.provide('API.Client.GenerateMassOrderLabelsRequest');

/**
 * Данные, необходимые для генерации файла. 
 * @record
 */
API.Client.GenerateMassOrderLabelsRequest = function() {}

/**
 * Идентификатор кабинета.
 * @type {!number}
 * @export
 */
API.Client.GenerateMassOrderLabelsRequest.prototype.businessId;

/**
 * Список идентификаторов заказов.
 * @type {!set<!number>}
 * @export
 */
API.Client.GenerateMassOrderLabelsRequest.prototype.orderIds;


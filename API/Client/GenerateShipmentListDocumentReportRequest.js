goog.provide('API.Client.GenerateShipmentListDocumentReportRequest');

/**
 * Данные, необходимые для генерации документа. 
 * @record
 */
API.Client.GenerateShipmentListDocumentReportRequest = function() {}

/**
 * Идентификатор кампании.
 * @type {!number}
 * @export
 */
API.Client.GenerateShipmentListDocumentReportRequest.prototype.campaignId;

/**
 * Идентификатор отгрузки.
 * @type {!number}
 * @export
 */
API.Client.GenerateShipmentListDocumentReportRequest.prototype.shipmentId;

/**
 * Фильтр по идентификаторам заказа в отгрузке.
 * @type {!Array<!number>}
 * @export
 */
API.Client.GenerateShipmentListDocumentReportRequest.prototype.orderIds;


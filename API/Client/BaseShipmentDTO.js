goog.provide('API.Client.BaseShipmentDTO');

/**
 * Информация об отгрузке.
 * @record
 */
API.Client.BaseShipmentDTO = function() {}

/**
 * Идентификатор отгрузки.
 * @type {!number}
 * @export
 */
API.Client.BaseShipmentDTO.prototype.id;

/**
 * Начало планового интервала отгрузки.
 * @type {!Date}
 * @export
 */
API.Client.BaseShipmentDTO.prototype.planIntervalFrom;

/**
 * Конец планового интервала отгрузки.
 * @type {!Date}
 * @export
 */
API.Client.BaseShipmentDTO.prototype.planIntervalTo;

/**
 * @type {!API.Client.ShipmentType}
 * @export
 */
API.Client.BaseShipmentDTO.prototype.shipmentType;

/**
 * @type {!API.Client.PartnerShipmentWarehouseDTO}
 * @export
 */
API.Client.BaseShipmentDTO.prototype.warehouse;

/**
 * @type {!API.Client.PartnerShipmentWarehouseDTO}
 * @export
 */
API.Client.BaseShipmentDTO.prototype.warehouseTo;

/**
 * Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
 * @type {!string}
 * @export
 */
API.Client.BaseShipmentDTO.prototype.externalId;

/**
 * @type {!API.Client.DeliveryServiceDTO}
 * @export
 */
API.Client.BaseShipmentDTO.prototype.deliveryService;

/**
 * @type {!API.Client.PalletsCountDTO}
 * @export
 */
API.Client.BaseShipmentDTO.prototype.palletsCount;

/**
 * Идентификаторы заказов в отгрузке.
 * @type {!set<!number>}
 * @export
 */
API.Client.BaseShipmentDTO.prototype.orderIds;

/**
 * Количество заказов, которое Маркет запланировал к отгрузке.
 * @type {!number}
 * @export
 */
API.Client.BaseShipmentDTO.prototype.draftCount;

/**
 * Количество заказов, которое Маркет подтвердил к отгрузке.
 * @type {!number}
 * @export
 */
API.Client.BaseShipmentDTO.prototype.plannedCount;

/**
 * Количество заказов, принятых в сортировочном центре или пункте приема.
 * @type {!number}
 * @export
 */
API.Client.BaseShipmentDTO.prototype.factCount;


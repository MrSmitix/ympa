goog.provide('API.Client.ShipmentDTO');

/**
 * Информация об отгрузке.
 * @record
 */
API.Client.ShipmentDTO = function() {}

/**
 * Идентификатор отгрузки.
 * @type {!number}
 * @export
 */
API.Client.ShipmentDTO.prototype.id;

/**
 * Начало планового интервала отгрузки.
 * @type {!Date}
 * @export
 */
API.Client.ShipmentDTO.prototype.planIntervalFrom;

/**
 * Конец планового интервала отгрузки.
 * @type {!Date}
 * @export
 */
API.Client.ShipmentDTO.prototype.planIntervalTo;

/**
 * @type {!API.Client.ShipmentType}
 * @export
 */
API.Client.ShipmentDTO.prototype.shipmentType;

/**
 * @type {!API.Client.PartnerShipmentWarehouseDTO}
 * @export
 */
API.Client.ShipmentDTO.prototype.warehouse;

/**
 * @type {!API.Client.PartnerShipmentWarehouseDTO}
 * @export
 */
API.Client.ShipmentDTO.prototype.warehouseTo;

/**
 * Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
 * @type {!string}
 * @export
 */
API.Client.ShipmentDTO.prototype.externalId;

/**
 * @type {!API.Client.DeliveryServiceDTO}
 * @export
 */
API.Client.ShipmentDTO.prototype.deliveryService;

/**
 * @type {!API.Client.PalletsCountDTO}
 * @export
 */
API.Client.ShipmentDTO.prototype.palletsCount;

/**
 * Идентификаторы заказов в отгрузке.
 * @type {!set<!number>}
 * @export
 */
API.Client.ShipmentDTO.prototype.orderIds;

/**
 * Количество заказов, которое Маркет запланировал к отгрузке.
 * @type {!number}
 * @export
 */
API.Client.ShipmentDTO.prototype.draftCount;

/**
 * Количество заказов, которое Маркет подтвердил к отгрузке.
 * @type {!number}
 * @export
 */
API.Client.ShipmentDTO.prototype.plannedCount;

/**
 * Количество заказов, принятых в сортировочном центре или пункте приема.
 * @type {!number}
 * @export
 */
API.Client.ShipmentDTO.prototype.factCount;

/**
 * @type {!API.Client.ShipmentStatusChangeDTO}
 * @export
 */
API.Client.ShipmentDTO.prototype.currentStatus;

/**
 * Доступные действия над отгрузкой.
 * @type {!set<!API.Client.ShipmentActionType>}
 * @export
 */
API.Client.ShipmentDTO.prototype.availableActions;


goog.provide('API.Client.ShipmentInfoDTO');

/**
 * Список с информацией об отгрузках.
 * @record
 */
API.Client.ShipmentInfoDTO = function() {}

/**
 * Идентификатор отгрузки.
 * @type {!number}
 * @export
 */
API.Client.ShipmentInfoDTO.prototype.id;

/**
 * Начало планового интервала отгрузки.
 * @type {!Date}
 * @export
 */
API.Client.ShipmentInfoDTO.prototype.planIntervalFrom;

/**
 * Конец планового интервала отгрузки.
 * @type {!Date}
 * @export
 */
API.Client.ShipmentInfoDTO.prototype.planIntervalTo;

/**
 * @type {!API.Client.ShipmentType}
 * @export
 */
API.Client.ShipmentInfoDTO.prototype.shipmentType;

/**
 * @type {!API.Client.PartnerShipmentWarehouseDTO}
 * @export
 */
API.Client.ShipmentInfoDTO.prototype.warehouse;

/**
 * @type {!API.Client.PartnerShipmentWarehouseDTO}
 * @export
 */
API.Client.ShipmentInfoDTO.prototype.warehouseTo;

/**
 * Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
 * @type {!string}
 * @export
 */
API.Client.ShipmentInfoDTO.prototype.externalId;

/**
 * @type {!API.Client.DeliveryServiceDTO}
 * @export
 */
API.Client.ShipmentInfoDTO.prototype.deliveryService;

/**
 * @type {!API.Client.PalletsCountDTO}
 * @export
 */
API.Client.ShipmentInfoDTO.prototype.palletsCount;

/**
 * Идентификаторы заказов в отгрузке.
 * @type {!set<!number>}
 * @export
 */
API.Client.ShipmentInfoDTO.prototype.orderIds;

/**
 * Количество заказов, которое Маркет запланировал к отгрузке.
 * @type {!number}
 * @export
 */
API.Client.ShipmentInfoDTO.prototype.draftCount;

/**
 * Количество заказов, которое Маркет подтвердил к отгрузке.
 * @type {!number}
 * @export
 */
API.Client.ShipmentInfoDTO.prototype.plannedCount;

/**
 * Количество заказов, принятых в сортировочном центре или пункте приема.
 * @type {!number}
 * @export
 */
API.Client.ShipmentInfoDTO.prototype.factCount;

/**
 * @type {!API.Client.ShipmentStatusType}
 * @export
 */
API.Client.ShipmentInfoDTO.prototype.status;

/**
 * Описание статуса отгрузки.
 * @type {!string}
 * @export
 */
API.Client.ShipmentInfoDTO.prototype.statusDescription;

/**
 * Время последнего изменения статуса отгрузки.
 * @type {!Date}
 * @export
 */
API.Client.ShipmentInfoDTO.prototype.statusUpdateTime;


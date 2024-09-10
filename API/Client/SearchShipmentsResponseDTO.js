goog.provide('API.Client.SearchShipmentsResponseDTO');

/**
 * Информация об отгрузках.
 * @record
 */
API.Client.SearchShipmentsResponseDTO = function() {}

/**
 * Список с информацией об отгрузках.
 * @type {!Array<!API.Client.ShipmentInfoDTO>}
 * @export
 */
API.Client.SearchShipmentsResponseDTO.prototype.shipments;

/**
 * @type {!API.Client.ForwardScrollingPagerDTO}
 * @export
 */
API.Client.SearchShipmentsResponseDTO.prototype.paging;


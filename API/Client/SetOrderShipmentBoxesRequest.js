goog.provide('API.Client.SetOrderShipmentBoxesRequest');

/**
 * @record
 */
API.Client.SetOrderShipmentBoxesRequest = function() {}

/**
 * Список грузовых мест. Маркет определяет количество мест по длине этого списка.
 * @type {!Array<!API.Client.ParcelBoxDTO>}
 * @export
 */
API.Client.SetOrderShipmentBoxesRequest.prototype.boxes;


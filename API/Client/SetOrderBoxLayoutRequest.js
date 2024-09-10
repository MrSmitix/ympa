goog.provide('API.Client.SetOrderBoxLayoutRequest');

/**
 * @record
 */
API.Client.SetOrderBoxLayoutRequest = function() {}

/**
 * Список коробок.
 * @type {!Array<!API.Client.OrderBoxLayoutDTO>}
 * @export
 */
API.Client.SetOrderBoxLayoutRequest.prototype.boxes;

/**
 * Передайте `true`, если вы собираетесь удалить часть товаров из заказа.
 * @type {!boolean}
 * @export
 */
API.Client.SetOrderBoxLayoutRequest.prototype.allowRemove;


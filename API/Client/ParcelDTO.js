goog.provide('API.Client.ParcelDTO');

/**
 * Информация о грузовых местах в заказе.
 * @record
 */
API.Client.ParcelDTO = function() {}

/**
 * Список грузовых мест. Маркет определяет количество мест по длине этого списка.
 * @type {!Array<!API.Client.ParcelBoxDTO>}
 * @export
 */
API.Client.ParcelDTO.prototype.boxes;


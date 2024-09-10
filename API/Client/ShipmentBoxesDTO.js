goog.provide('API.Client.ShipmentBoxesDTO');

/**
 * В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
 * @record
 */
API.Client.ShipmentBoxesDTO = function() {}

/**
 * Список грузовых мест. Маркет определил количество мест по длине этого списка. 
 * @type {!Array<!API.Client.ParcelBoxDTO>}
 * @export
 */
API.Client.ShipmentBoxesDTO.prototype.boxes;


goog.provide('API.Client.OutletResponseDTO');

/**
 * Результат выполнения запроса. Выводится, если `status=\"OK\"`. 
 * @record
 */
API.Client.OutletResponseDTO = function() {}

/**
 * Идентификатор точки продаж, присвоенный Маркетом.
 * @type {!number}
 * @export
 */
API.Client.OutletResponseDTO.prototype.id;


goog.provide('API.Client.OrderCourierDTO');

/**
 * Информация о курьере.
 * @record
 */
API.Client.OrderCourierDTO = function() {}

/**
 * Полное имя курьера.
 * @type {!string}
 * @export
 */
API.Client.OrderCourierDTO.prototype.fullName;

/**
 * Номер телефона курьера.
 * @type {!string}
 * @export
 */
API.Client.OrderCourierDTO.prototype.phone;

/**
 * Добавочный номер телефона.
 * @type {!string}
 * @export
 */
API.Client.OrderCourierDTO.prototype.phoneExtension;

/**
 * Номер транспортного средства.
 * @type {!string}
 * @export
 */
API.Client.OrderCourierDTO.prototype.vehicleNumber;

/**
 * Описание машины. Например, модель и цвет.
 * @type {!string}
 * @export
 */
API.Client.OrderCourierDTO.prototype.vehicleDescription;


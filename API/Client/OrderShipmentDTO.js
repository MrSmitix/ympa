goog.provide('API.Client.OrderShipmentDTO');

/**
 * Список посылок.  В параметре может указываться несколько посылок. 
 * @record
 */
API.Client.OrderShipmentDTO = function() {}

/**
 * Идентификатор посылки, присвоенный Маркетом.
 * @type {!number}
 * @export
 */
API.Client.OrderShipmentDTO.prototype.id;

/**
 * Формат даты: `ДД-ММ-ГГГГ`. 
 * @type {!string}
 * @export
 */
API.Client.OrderShipmentDTO.prototype.shipmentDate;

/**
 * **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
 * @type {!string}
 * @export
 */
API.Client.OrderShipmentDTO.prototype.shipmentTime;

/**
 * **Только для модели DBS**  Информация для отслеживания перемещений посылки. 
 * @type {!Array<!API.Client.OrderTrackDTO>}
 * @export
 */
API.Client.OrderShipmentDTO.prototype.tracks;

/**
 * Список грузовых мест.
 * @type {!Array<!API.Client.OrderParcelBoxDTO>}
 * @export
 */
API.Client.OrderShipmentDTO.prototype.boxes;


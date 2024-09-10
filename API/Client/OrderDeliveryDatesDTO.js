goog.provide('API.Client.OrderDeliveryDatesDTO');

/**
 * Диапазон дат доставки.
 * @record
 */
API.Client.OrderDeliveryDatesDTO = function() {}

/**
 * Формат даты: `ДД-ММ-ГГГГ`. 
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryDatesDTO.prototype.fromDate;

/**
 * Формат даты: `ДД-ММ-ГГГГ`. 
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryDatesDTO.prototype.toDate;

/**
 * Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`. 
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryDatesDTO.prototype.fromTime;

/**
 * Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`. 
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryDatesDTO.prototype.toTime;

/**
 * Формат даты: `ДД-ММ-ГГГГ`. 
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryDatesDTO.prototype.realDeliveryDate;


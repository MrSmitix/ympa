goog.provide('API.Client.OrderDeliveryAddressDTO');

/**
 * Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). 
 * @record
 */
API.Client.OrderDeliveryAddressDTO = function() {}

/**
 * Страна.  Обязательный параметр. 
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryAddressDTO.prototype.country;

/**
 * Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). 
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryAddressDTO.prototype.postcode;

/**
 * Город или населенный пункт.  Обязательный параметр. 
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryAddressDTO.prototype.city;

/**
 * Район.
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryAddressDTO.prototype.district;

/**
 * Станция метро.
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryAddressDTO.prototype.subway;

/**
 * Улица.  Обязательный параметр. 
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryAddressDTO.prototype.street;

/**
 * Дом или владение.  Обязательный параметр. 
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryAddressDTO.prototype.house;

/**
 * Корпус или строение.
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryAddressDTO.prototype.block;

/**
 * Подъезд.
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryAddressDTO.prototype.entrance;

/**
 * Код домофона.
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryAddressDTO.prototype.entryphone;

/**
 * Этаж.
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryAddressDTO.prototype.floor;

/**
 * Квартира или офис.
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryAddressDTO.prototype.apartment;

/**
 * Телефон получателя заказа.  Обязательный параметр. 
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryAddressDTO.prototype.phone;

/**
 * Фамилия, имя и отчество получателя заказа.  Обязательный параметр. 
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryAddressDTO.prototype.recipient;

/**
 * @type {!API.Client.GpsDTO}
 * @export
 */
API.Client.OrderDeliveryAddressDTO.prototype.gps;


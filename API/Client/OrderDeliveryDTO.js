goog.provide('API.Client.OrderDeliveryDTO');

/**
 * Информация о доставке.
 * @record
 */
API.Client.OrderDeliveryDTO = function() {}

/**
 * Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). 
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryDTO.prototype.id;

/**
 * @type {!API.Client.OrderDeliveryType}
 * @export
 */
API.Client.OrderDeliveryDTO.prototype.type;

/**
 * Наименование службы доставки.
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryDTO.prototype.serviceName;

/**
 * {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. 
 * @type {!number}
 * @export
 */
API.Client.OrderDeliveryDTO.prototype.price;

/**
 * @type {!API.Client.OrderDeliveryPartnerType}
 * @export
 */
API.Client.OrderDeliveryDTO.prototype.deliveryPartnerType;

/**
 * @type {!API.Client.OrderCourierDTO}
 * @export
 */
API.Client.OrderDeliveryDTO.prototype.courier;

/**
 * @type {!API.Client.OrderDeliveryDatesDTO}
 * @export
 */
API.Client.OrderDeliveryDTO.prototype.dates;

/**
 * @type {!API.Client.RegionDTO}
 * @export
 */
API.Client.OrderDeliveryDTO.prototype.region;

/**
 * @type {!API.Client.OrderDeliveryAddressDTO}
 * @export
 */
API.Client.OrderDeliveryDTO.prototype.address;

/**
 * @type {!API.Client.OrderVatType}
 * @export
 */
API.Client.OrderDeliveryDTO.prototype.vat;

/**
 * Идентификатор службы доставки.
 * @type {!number}
 * @export
 */
API.Client.OrderDeliveryDTO.prototype.deliveryServiceId;

/**
 * @type {!API.Client.OrderLiftType}
 * @export
 */
API.Client.OrderDeliveryDTO.prototype.liftType;

/**
 * Стоимость подъема на этаж.
 * @type {!number}
 * @export
 */
API.Client.OrderDeliveryDTO.prototype.liftPrice;

/**
 * Идентификатор пункта самовывоза, присвоенный магазином.
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryDTO.prototype.outletCode;

/**
 * Формат даты: `ДД-ММ-ГГГГ`. 
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryDTO.prototype.outletStorageLimitDate;

/**
 * @type {!API.Client.OrderDeliveryDispatchType}
 * @export
 */
API.Client.OrderDeliveryDTO.prototype.dispatchType;

/**
 * Информация для отслеживания перемещений посылки.
 * @type {!Array<!API.Client.OrderTrackDTO>}
 * @export
 */
API.Client.OrderDeliveryDTO.prototype.tracks;

/**
 * Информация о посылках.
 * @type {!Array<!API.Client.OrderShipmentDTO>}
 * @export
 */
API.Client.OrderDeliveryDTO.prototype.shipments;

/**
 * Приблизительная ли дата доставки.
 * @type {!boolean}
 * @export
 */
API.Client.OrderDeliveryDTO.prototype.estimated;

/**
 * @type {!API.Client.OrderDeliveryEacType}
 * @export
 */
API.Client.OrderDeliveryDTO.prototype.eacType;

/**
 * Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). 
 * @type {!string}
 * @export
 */
API.Client.OrderDeliveryDTO.prototype.eacCode;


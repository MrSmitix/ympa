goog.provide('API.Client.ParcelBoxLabelDTO');

/**
 * Информация о ярлыке для коробки.
 * @record
 */
API.Client.ParcelBoxLabelDTO = function() {}

/**
 * Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). 
 * @type {!string}
 * @export
 */
API.Client.ParcelBoxLabelDTO.prototype.url;

/**
 * Юридическое название магазина.
 * @type {!string}
 * @export
 */
API.Client.ParcelBoxLabelDTO.prototype.supplierName;

/**
 * Юридическое название службы доставки.
 * @type {!string}
 * @export
 */
API.Client.ParcelBoxLabelDTO.prototype.deliveryServiceName;

/**
 * Идентификатор заказа в системе Маркета.
 * @type {!number}
 * @export
 */
API.Client.ParcelBoxLabelDTO.prototype.orderId;

/**
 * Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. 
 * @type {!string}
 * @export
 */
API.Client.ParcelBoxLabelDTO.prototype.orderNum;

/**
 * Фамилия и инициалы получателя заказа.
 * @type {!string}
 * @export
 */
API.Client.ParcelBoxLabelDTO.prototype.recipientName;

/**
 * Идентификатор коробки.
 * @type {!number}
 * @export
 */
API.Client.ParcelBoxLabelDTO.prototype.boxId;

/**
 * Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. 
 * @type {!string}
 * @export
 */
API.Client.ParcelBoxLabelDTO.prototype.fulfilmentId;

/**
 * Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. 
 * @type {!string}
 * @export
 */
API.Client.ParcelBoxLabelDTO.prototype.place;

/**
 * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. 
 * @type {!string}
 * @export
 */
API.Client.ParcelBoxLabelDTO.prototype.weight;

/**
 * Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
 * @type {!string}
 * @export
 */
API.Client.ParcelBoxLabelDTO.prototype.deliveryServiceId;

/**
 * Адрес получателя.
 * @type {!string}
 * @export
 */
API.Client.ParcelBoxLabelDTO.prototype.deliveryAddress;

/**
 * Дата отгрузки в формате `dd.MM.yyyy`.
 * @type {!string}
 * @export
 */
API.Client.ParcelBoxLabelDTO.prototype.shipmentDate;


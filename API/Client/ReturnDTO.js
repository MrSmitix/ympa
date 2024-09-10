goog.provide('API.Client.ReturnDTO');

/**
 * Возврат заказа.
 * @record
 */
API.Client.ReturnDTO = function() {}

/**
 * Идентификатор возврата.
 * @type {!number}
 * @export
 */
API.Client.ReturnDTO.prototype.id;

/**
 * Номер заказа.
 * @type {!number}
 * @export
 */
API.Client.ReturnDTO.prototype.orderId;

/**
 * Дата создания возврата клиентом.
 * @type {!Date}
 * @export
 */
API.Client.ReturnDTO.prototype.creationDate;

/**
 * Дата обновления возврата.
 * @type {!Date}
 * @export
 */
API.Client.ReturnDTO.prototype.updateDate;

/**
 * @type {!API.Client.RefundStatusType}
 * @export
 */
API.Client.ReturnDTO.prototype.refundStatus;

/**
 * @type {!API.Client.LogisticPickupPointDTO}
 * @export
 */
API.Client.ReturnDTO.prototype.logisticPickupPoint;

/**
 * @type {!API.Client.RecipientType}
 * @export
 */
API.Client.ReturnDTO.prototype.shipmentRecipientType;

/**
 * @type {!API.Client.ReturnShipmentStatusType}
 * @export
 */
API.Client.ReturnDTO.prototype.shipmentStatus;

/**
 * Сумма возврата.
 * @type {!number}
 * @export
 */
API.Client.ReturnDTO.prototype.refundAmount;

/**
 * Список товаров в возврате.
 * @type {!Array<!API.Client.ReturnItemDTO>}
 * @export
 */
API.Client.ReturnDTO.prototype.items;

/**
 * @type {!API.Client.ReturnType}
 * @export
 */
API.Client.ReturnDTO.prototype.returnType;

/**
 * Используется ли опция **Быстрый возврат денег за дешевый брак**. 
 * @type {!boolean}
 * @export
 */
API.Client.ReturnDTO.prototype.fastReturn;


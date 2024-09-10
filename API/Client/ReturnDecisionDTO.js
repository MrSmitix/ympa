goog.provide('API.Client.ReturnDecisionDTO');

/**
 * Решения по возвратам.
 * @record
 */
API.Client.ReturnDecisionDTO = function() {}

/**
 * Идентификатор товара в возврате.
 * @type {!number}
 * @export
 */
API.Client.ReturnDecisionDTO.prototype.returnItemId;

/**
 * Количество единиц товара.
 * @type {!number}
 * @export
 */
API.Client.ReturnDecisionDTO.prototype.count;

/**
 * Комментарий.
 * @type {!string}
 * @export
 */
API.Client.ReturnDecisionDTO.prototype.comment;

/**
 * @type {!API.Client.ReturnDecisionReasonType}
 * @export
 */
API.Client.ReturnDecisionDTO.prototype.reasonType;

/**
 * @type {!API.Client.ReturnDecisionSubreasonType}
 * @export
 */
API.Client.ReturnDecisionDTO.prototype.subreasonType;

/**
 * @type {!API.Client.ReturnDecisionType}
 * @export
 */
API.Client.ReturnDecisionDTO.prototype.decisionType;

/**
 * Сумма возврата.
 * @type {!number}
 * @export
 */
API.Client.ReturnDecisionDTO.prototype.refundAmount;

/**
 * Компенсация за обратную доставку.
 * @type {!number}
 * @export
 */
API.Client.ReturnDecisionDTO.prototype.partnerCompensation;

/**
 * Список хеш-кодов фотографий товара от покупателя.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ReturnDecisionDTO.prototype.images;


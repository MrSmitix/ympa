goog.provide('API.Client.SetReturnDecisionRequest');

/**
 * Решения по позиции в возврате.
 * @record
 */
API.Client.SetReturnDecisionRequest = function() {}

/**
 * Идентификатор товара в возврате.
 * @type {!number}
 * @export
 */
API.Client.SetReturnDecisionRequest.prototype.returnItemId;

/**
 * @type {!API.Client.ReturnRequestDecisionType}
 * @export
 */
API.Client.SetReturnDecisionRequest.prototype.decisionType;

/**
 * Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете. 
 * @type {!string}
 * @export
 */
API.Client.SetReturnDecisionRequest.prototype.comment;


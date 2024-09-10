package org.openapitools.server.model


/**
 * Решения по позиции в возврате.
 *
 * @param returnItemId Идентификатор товара в возврате. for example: ''null''
 * @param decisionType  for example: ''null''
 * @param comment Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете.  for example: ''null''
*/
final case class SetReturnDecisionRequest (
  returnItemId: Long,
  decisionType: ReturnRequestDecisionType,
  comment: Option[String] = None
)


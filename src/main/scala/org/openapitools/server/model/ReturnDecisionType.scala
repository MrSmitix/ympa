package org.openapitools.server.model


/**
 * Решение по возврату:  * `REFUND_MONEY` — вернуть деньги покупателю.  * `REFUND_MONEY_INCLUDING_SHIPMENT` — вернуть деньги за товар и пересылку.  * `REPAIR` — отремонтировать товар.  * `REPLACE` — заменить товар.  * `SEND_TO_EXAMINATION` — взять товар на экспертизу.  * `DECLINE_REFUND` — отказать в возврате.  * `OTHER_DECISION` — другое решение. 
 *
*/
final case class ReturnDecisionType (
)


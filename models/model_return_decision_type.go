package models
// ReturnDecisionType : Решение по возврату:  * `REFUND_MONEY` — вернуть деньги покупателю.  * `REFUND_MONEY_INCLUDING_SHIPMENT` — вернуть деньги за товар и пересылку.  * `REPAIR` — отремонтировать товар.  * `REPLACE` — заменить товар.  * `SEND_TO_EXAMINATION` — взять товар на экспертизу.  * `DECLINE_REFUND` — отказать в возврате.  * `OTHER_DECISION` — другое решение. 
type ReturnDecisionType string

// List of ReturnDecisionType
const (
	REFUND_MONEY ReturnDecisionType = "REFUND_MONEY"
	REFUND_MONEY_INCLUDING_SHIPMENT ReturnDecisionType = "REFUND_MONEY_INCLUDING_SHIPMENT"
	REPAIR ReturnDecisionType = "REPAIR"
	REPLACE ReturnDecisionType = "REPLACE"
	SEND_TO_EXAMINATION ReturnDecisionType = "SEND_TO_EXAMINATION"
	DECLINE_REFUND ReturnDecisionType = "DECLINE_REFUND"
	OTHER_DECISION ReturnDecisionType = "OTHER_DECISION"
	UNKNOWN ReturnDecisionType = "UNKNOWN"
)

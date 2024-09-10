package models
// ReturnRequestDecisionType : Решение по возврату.
type ReturnRequestDecisionType string

// List of ReturnRequestDecisionType
const (
	REFUND_MONEY ReturnRequestDecisionType = "REFUND_MONEY"
	REFUND_MONEY_INCLUDING_SHIPMENT ReturnRequestDecisionType = "REFUND_MONEY_INCLUDING_SHIPMENT"
	REPAIR ReturnRequestDecisionType = "REPAIR"
	REPLACE ReturnRequestDecisionType = "REPLACE"
	SEND_TO_EXAMINATION ReturnRequestDecisionType = "SEND_TO_EXAMINATION"
	DECLINE_REFUND ReturnRequestDecisionType = "DECLINE_REFUND"
	OTHER_DECISION ReturnRequestDecisionType = "OTHER_DECISION"
)

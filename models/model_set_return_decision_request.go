package models

// SetReturnDecisionRequest - Решения по позиции в возврате.
type SetReturnDecisionRequest struct {

	// Идентификатор товара в возврате.
	ReturnItemId int64 `json:"returnItemId"`

	DecisionType ReturnRequestDecisionType `json:"decisionType"`

	// Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете. 
	Comment string `json:"comment,omitempty"`
}

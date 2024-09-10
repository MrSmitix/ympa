package models

type AcceptOrderCancellationRequest struct {

	// Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов. 
	Accepted bool `json:"accepted"`

	Reason OrderCancellationReasonType `json:"reason,omitempty"`
}

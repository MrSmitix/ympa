package models

// OrderItemSubsidyDto - Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 
type OrderItemSubsidyDto struct {

	Type OrderItemSubsidyType `json:"type,omitempty"`

	// Сумма субсидии.
	Amount float32 `json:"amount,omitempty"`
}

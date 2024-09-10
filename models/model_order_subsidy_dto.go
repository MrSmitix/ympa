package models

// OrderSubsidyDto - Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 
type OrderSubsidyDto struct {

	Type OrderSubsidyType `json:"type,omitempty"`

	// Сумма субсидии.
	Amount float32 `json:"amount,omitempty"`
}

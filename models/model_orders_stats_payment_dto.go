package models

// OrdersStatsPaymentDto - Информация о денежных переводах по заказу.
type OrdersStatsPaymentDto struct {

	// Идентификатор денежного перевода.
	Id string `json:"id,omitempty"`

	// Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`. 
	Date string `json:"date,omitempty"`

	Type OrdersStatsPaymentType `json:"type,omitempty"`

	Source OrdersStatsPaymentSourceType `json:"source,omitempty"`

	// Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. 
	Total float32 `json:"total,omitempty"`

	PaymentOrder OrdersStatsPaymentOrderDto `json:"paymentOrder,omitempty"`
}

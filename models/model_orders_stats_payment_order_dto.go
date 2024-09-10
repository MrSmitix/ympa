package models

// OrdersStatsPaymentOrderDto - Информация о платежном получении.
type OrdersStatsPaymentOrderDto struct {

	// Номер платежного поручения.
	Id string `json:"id,omitempty"`

	// Дата платежного поручения.  Формат даты: `ГГГГ‑ММ‑ДД`. 
	Date string `json:"date,omitempty"`
}

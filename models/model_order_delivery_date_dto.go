package models

// OrderDeliveryDateDto - Информация о новой дате доставки заказа.
type OrderDeliveryDateDto struct {

	// Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
	ToDate string `json:"toDate"`
}

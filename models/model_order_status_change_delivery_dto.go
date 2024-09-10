package models

// OrderStatusChangeDeliveryDto - Информация о доставке.
type OrderStatusChangeDeliveryDto struct {

	Dates OrderStatusChangeDeliveryDatesDto `json:"dates,omitempty"`
}

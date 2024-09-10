package models

// UpdateOrderStatusesRequest - Список заказов.
type UpdateOrderStatusesRequest struct {

	// Список заказов.
	Orders []OrderStateDto `json:"orders"`
}

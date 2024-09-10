package models

// UpdateOrderStatusResponse - Информация об изменении статуса заказа.
type UpdateOrderStatusResponse struct {

	Order OrderDto `json:"order,omitempty"`
}

package models

// UpdateOrderStatusesDto - Список заказов, статус которых обновился.
type UpdateOrderStatusesDto struct {

	// Список с обновленными заказами.
	Orders []UpdateOrderStatusDto `json:"orders"`
}

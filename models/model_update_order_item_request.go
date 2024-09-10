package models

// UpdateOrderItemRequest - Запрос на обновление состава заказа.
type UpdateOrderItemRequest struct {

	// Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
	Items []OrderItemModificationDto `json:"items"`

	Reason OrderItemsModificationRequestReasonType `json:"reason,omitempty"`
}

package models

// CreateChatRequest - Заказ, для которого нужно создать чат. 
type CreateChatRequest struct {

	// Идентификатор заказа на Маркете.
	OrderId int64 `json:"orderId"`
}

package models

type UpdateOrderStatusRequest struct {

	Order OrderStatusChangeDto `json:"order"`
}

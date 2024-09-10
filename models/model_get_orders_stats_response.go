package models

// GetOrdersStatsResponse - Ответ на запрос информации по заказам.
type GetOrdersStatsResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result OrdersStatsDto `json:"result,omitempty"`
}

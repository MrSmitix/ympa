package models

// TransferOrdersFromShipmentRequest - Запрос переноса заказов из отгрузки.
type TransferOrdersFromShipmentRequest struct {

	// Список заказов, которые вы не успеваете подготовить.
	OrderIds []int64 `json:"orderIds"`
}

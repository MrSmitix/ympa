package models

// OrdersShipmentInfoDto - Годные/негодные ярлыки по заказам в отгрузке.
type OrdersShipmentInfoDto struct {

	// Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
	OrderIdsWithLabels []int64 `json:"orderIdsWithLabels"`

	// Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
	OrderIdsWithoutLabels []int64 `json:"orderIdsWithoutLabels"`
}

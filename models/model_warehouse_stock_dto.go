package models

// WarehouseStockDto - Информация об остатках товара.
type WarehouseStockDto struct {

	Type WarehouseStockType `json:"type"`

	// Значение остатков.
	Count int64 `json:"count"`
}

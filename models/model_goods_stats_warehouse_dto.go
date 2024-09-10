package models

// GoodsStatsWarehouseDto - Информация о складе.
type GoodsStatsWarehouseDto struct {

	// Идентификатор склада.
	Id int64 `json:"id,omitempty"`

	// Название склада.
	Name string `json:"name,omitempty"`

	// Информация об остатках товаров на складе.
	Stocks []WarehouseStockDto `json:"stocks"`
}

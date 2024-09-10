package models

// WarehouseOffersDto - Информация об остатках товаров на складе.
type WarehouseOffersDto struct {

	// Идентификатор склада.
	WarehouseId int64 `json:"warehouseId"`

	// Информация об остатках.
	Offers []WarehouseOfferDto `json:"offers"`
}

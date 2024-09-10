package models

// GetWarehouseStocksDto - Список складов с информацией об остатках на каждом из них.
type GetWarehouseStocksDto struct {

	Paging ScrollingPagerDto `json:"paging,omitempty"`

	// Страница списка складов.
	Warehouses []WarehouseOffersDto `json:"warehouses"`
}

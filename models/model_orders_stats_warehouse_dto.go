package models

// OrdersStatsWarehouseDto - Информация о складе, на котором хранится товар.
type OrdersStatsWarehouseDto struct {

	// Идентификатор склада.
	Id int64 `json:"id,omitempty"`

	// Название склада.
	Name string `json:"name,omitempty"`
}

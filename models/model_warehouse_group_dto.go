package models

// WarehouseGroupDto - Информация о группе складов.
type WarehouseGroupDto struct {

	// Название группы складов.
	Name string `json:"name"`

	MainWarehouse WarehouseDto `json:"mainWarehouse"`

	// Список складов, входящих в группу.
	Warehouses []WarehouseDto `json:"warehouses"`
}

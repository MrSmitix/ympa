package models

// WarehousesDto - Информация о складах и группах складов.
type WarehousesDto struct {

	// Список складов, не входящих в группы.
	Warehouses []WarehouseDto `json:"warehouses"`

	// Список групп складов.
	WarehouseGroups []WarehouseGroupDto `json:"warehouseGroups"`
}

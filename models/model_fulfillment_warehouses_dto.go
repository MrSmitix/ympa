package models

// FulfillmentWarehousesDto - Список складов Маркета (FBY).
type FulfillmentWarehousesDto struct {

	// Список складов Маркета (FBY).
	Warehouses []FulfillmentWarehouseDto `json:"warehouses"`
}

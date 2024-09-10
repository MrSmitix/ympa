package models

// FulfillmentWarehouseDto - Склад Маркета (FBY).
type FulfillmentWarehouseDto struct {

	// Идентификатор склада.
	Id int64 `json:"id"`

	// Название склада.
	Name string `json:"name"`

	Address WarehouseAddressDto `json:"address,omitempty"`
}

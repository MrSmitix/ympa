package models

// PartnerShipmentWarehouseDto - Данные о складе отправления.
type PartnerShipmentWarehouseDto struct {

	// Идентификатор склада отправления.
	Id int64 `json:"id,omitempty"`

	// Наименование склада отправления.
	Name string `json:"name,omitempty"`

	// Адрес склада отправления.
	Address string `json:"address,omitempty"`
}

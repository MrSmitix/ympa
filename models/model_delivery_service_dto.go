package models

// DeliveryServiceDto - Служба доставки.
type DeliveryServiceDto struct {

	// Идентификатор службы доставки.
	Id int64 `json:"id,omitempty"`

	// Наименование службы доставки.
	Name string `json:"name,omitempty"`
}

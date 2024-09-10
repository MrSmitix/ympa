package models

// DeliveryServiceInfoDto - Информация о службе доставки.
type DeliveryServiceInfoDto struct {

	// Идентификатор службы доставки.
	Id int64 `json:"id"`

	// Наименование службы доставки.
	Name string `json:"name"`
}

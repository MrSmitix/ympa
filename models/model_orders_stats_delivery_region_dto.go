package models

// OrdersStatsDeliveryRegionDto - Информация о регионе доставки.
type OrdersStatsDeliveryRegionDto struct {

	// Идентификатор региона доставки.
	Id int64 `json:"id,omitempty"`

	// Название региона доставки.
	Name string `json:"name,omitempty"`
}

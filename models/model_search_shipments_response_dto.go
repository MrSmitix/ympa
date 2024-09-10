package models

// SearchShipmentsResponseDto - Информация об отгрузках.
type SearchShipmentsResponseDto struct {

	// Список с информацией об отгрузках.
	Shipments []ShipmentInfoDto `json:"shipments"`

	Paging ForwardScrollingPagerDto `json:"paging,omitempty"`
}

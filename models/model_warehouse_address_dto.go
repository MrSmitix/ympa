package models

// WarehouseAddressDto - Адрес склада.
type WarehouseAddressDto struct {

	// Город.
	City string `json:"city"`

	// Улица.
	Street string `json:"street,omitempty"`

	// Номер дома.
	Number string `json:"number,omitempty"`

	// Номер строения.
	Building string `json:"building,omitempty"`

	// Номер корпуса.
	Block string `json:"block,omitempty"`

	Gps GpsDto `json:"gps"`
}

package models

// PickupAddressDto - Адрес доставки.
type PickupAddressDto struct {

	// Страна.
	Country string `json:"country,omitempty"`

	// Город.
	City string `json:"city,omitempty"`

	// Улица.
	Street string `json:"street,omitempty"`

	// Номер дома.
	House string `json:"house,omitempty"`

	// Почтовый индекс.
	Postcode string `json:"postcode,omitempty"`
}

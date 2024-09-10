package models

// GetOfferMappingDto - Информация о товаре.
type GetOfferMappingDto struct {

	Offer GetOfferDto `json:"offer,omitempty"`

	Mapping GetMappingDto `json:"mapping,omitempty"`
}

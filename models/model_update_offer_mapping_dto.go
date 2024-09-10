package models

// UpdateOfferMappingDto - Информация о товаре.
type UpdateOfferMappingDto struct {

	Offer UpdateOfferDto `json:"offer"`

	Mapping UpdateMappingDto `json:"mapping,omitempty"`
}

package models

// SuggestedOfferMappingDto - Товар с соответствующей карточкой на Маркете.
type SuggestedOfferMappingDto struct {

	Offer SuggestedOfferDto `json:"offer,omitempty"`

	Mapping GetMappingDto `json:"mapping,omitempty"`
}

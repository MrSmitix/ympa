package models

// OfferMappingEntryDto - Список товаров. 
type OfferMappingEntryDto struct {

	Mapping OfferMappingDto `json:"mapping,omitempty"`

	AwaitingModerationMapping OfferMappingDto `json:"awaitingModerationMapping,omitempty"`

	RejectedMapping OfferMappingDto `json:"rejectedMapping,omitempty"`

	Offer MappingsOfferDto `json:"offer,omitempty"`
}

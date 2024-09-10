package models

// OfferMappingInfoDto - Информация о карточке товара.
type OfferMappingInfoDto struct {

	Mapping OfferMappingDto `json:"mapping,omitempty"`

	AwaitingModerationMapping OfferMappingDto `json:"awaitingModerationMapping,omitempty"`

	RejectedMapping OfferMappingDto `json:"rejectedMapping,omitempty"`
}

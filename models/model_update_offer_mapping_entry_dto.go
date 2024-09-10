package models

// UpdateOfferMappingEntryDto - Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. 
type UpdateOfferMappingEntryDto struct {

	Mapping OfferMappingDto `json:"mapping,omitempty"`

	AwaitingModerationMapping OfferMappingDto `json:"awaitingModerationMapping,omitempty"`

	RejectedMapping OfferMappingDto `json:"rejectedMapping,omitempty"`

	Offer UpdateMappingsOfferDto `json:"offer,omitempty"`
}

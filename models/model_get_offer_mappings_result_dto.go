package models

// GetOfferMappingsResultDto - Информация о товарах.
type GetOfferMappingsResultDto struct {

	Paging ScrollingPagerDto `json:"paging,omitempty"`

	// Информация о товарах.
	OfferMappings []GetOfferMappingDto `json:"offerMappings"`
}

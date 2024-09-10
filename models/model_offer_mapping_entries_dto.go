package models

// OfferMappingEntriesDto - Информация о товарах в каталоге.
type OfferMappingEntriesDto struct {

	Paging ScrollingPagerDto `json:"paging,omitempty"`

	// Информация о товарах в каталоге.
	OfferMappingEntries []OfferMappingEntryDto `json:"offerMappingEntries"`
}

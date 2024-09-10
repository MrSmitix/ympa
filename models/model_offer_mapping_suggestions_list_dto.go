package models

// OfferMappingSuggestionsListDto - Список рекомендованных карточек товара.
type OfferMappingSuggestionsListDto struct {

	// Список товаров.
	Offers []EnrichedMappingsOfferDto `json:"offers"`
}

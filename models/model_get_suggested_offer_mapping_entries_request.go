package models

// GetSuggestedOfferMappingEntriesRequest - Запрос рекомендованных карточек товара.
type GetSuggestedOfferMappingEntriesRequest struct {

	// Список товаров.
	Offers []MappingsOfferDto `json:"offers"`
}

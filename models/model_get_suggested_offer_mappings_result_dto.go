package models

// GetSuggestedOfferMappingsResultDto - Подобранные карточки на Маркете.
type GetSuggestedOfferMappingsResultDto struct {

	// Список товаров.
	Offers []SuggestedOfferMappingDto `json:"offers"`
}

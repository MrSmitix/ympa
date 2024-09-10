package models

// UpdateOfferMappingEntryRequest - Запрос на обновление товаров.
type UpdateOfferMappingEntryRequest struct {

	// Информация о товарах в каталоге.
	OfferMappingEntries []UpdateOfferMappingEntryDto `json:"offerMappingEntries"`
}

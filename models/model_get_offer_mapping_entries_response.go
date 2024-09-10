package models

// GetOfferMappingEntriesResponse - Ответ на запрос списка товаров в каталоге.
type GetOfferMappingEntriesResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result OfferMappingEntriesDto `json:"result,omitempty"`
}

package models

// GetSuggestedOfferMappingEntriesResponse - Ответ со списком рекомендованных карточек товара.
type GetSuggestedOfferMappingEntriesResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result OfferMappingSuggestionsListDto `json:"result,omitempty"`
}

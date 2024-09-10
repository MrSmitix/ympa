package models

// SuggestPricesResponse - Ответ на запрос списка цен для продвижения.
type SuggestPricesResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result SuggestPricesResultDto `json:"result,omitempty"`
}

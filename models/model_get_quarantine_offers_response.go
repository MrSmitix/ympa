package models

// GetQuarantineOffersResponse - Ответ на запрос списка товаров в карантине.
type GetQuarantineOffersResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result GetQuarantineOffersResultDto `json:"result,omitempty"`
}

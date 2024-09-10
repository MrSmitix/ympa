package models

// GetHiddenOffersResponse - Ответ на запрос списка скрытий.
type GetHiddenOffersResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result GetHiddenOffersResultDto `json:"result,omitempty"`
}

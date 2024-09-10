package models

// GetOfferCardsContentStatusResponse - Ответ со списком состояний товаров и пагинацией.
type GetOfferCardsContentStatusResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result OfferCardsContentStatusDto `json:"result,omitempty"`
}

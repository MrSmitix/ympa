package models

// GetPricesByOfferIdsResponse - Ответ на запрос списка цен.
type GetPricesByOfferIdsResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result OfferPriceByOfferIdsListResponseDto `json:"result,omitempty"`
}

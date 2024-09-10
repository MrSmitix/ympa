package models

// GetPricesResponse - Ответ на запрос списка цен.
type GetPricesResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result OfferPriceListResponseDto `json:"result,omitempty"`
}

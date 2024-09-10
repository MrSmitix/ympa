package models

// UpdatePromoOffersResponse - Результат добавления товаров в акцию.
type UpdatePromoOffersResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result UpdatePromoOffersResultDto `json:"result,omitempty"`
}

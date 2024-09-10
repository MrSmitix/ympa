package models

// DeletePromoOffersResponse - Результат удаления товаров из акции.
type DeletePromoOffersResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result DeletePromoOffersResultDto `json:"result,omitempty"`
}

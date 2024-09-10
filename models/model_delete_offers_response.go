package models

// DeleteOffersResponse - Результат удаления товаров.
type DeleteOffersResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result DeleteOffersDto `json:"result,omitempty"`
}

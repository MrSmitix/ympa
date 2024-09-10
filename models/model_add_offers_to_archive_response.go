package models

// AddOffersToArchiveResponse - Результат архивации товаров.
type AddOffersToArchiveResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result AddOffersToArchiveDto `json:"result,omitempty"`
}

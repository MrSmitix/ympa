package models

// DeleteOffersFromArchiveResponse - Результат разархивации товаров.
type DeleteOffersFromArchiveResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result DeleteOffersFromArchiveDto `json:"result,omitempty"`
}

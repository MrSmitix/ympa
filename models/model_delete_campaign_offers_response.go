package models

// DeleteCampaignOffersResponse - Результат удаления товаров.
type DeleteCampaignOffersResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result DeleteCampaignOffersDto `json:"result,omitempty"`
}

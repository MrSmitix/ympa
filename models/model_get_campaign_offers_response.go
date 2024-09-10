package models

// GetCampaignOffersResponse - Ответ на запрос списка товаров в магазине.
type GetCampaignOffersResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result GetCampaignOffersResultDto `json:"result,omitempty"`
}

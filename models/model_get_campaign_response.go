package models

// GetCampaignResponse - Информация о магазине к данным идентификатора кампании.
type GetCampaignResponse struct {

	Campaign CampaignDto `json:"campaign,omitempty"`
}

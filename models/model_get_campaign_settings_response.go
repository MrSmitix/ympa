package models

// GetCampaignSettingsResponse - Ответ на запрос настроек магазина.
type GetCampaignSettingsResponse struct {

	Settings CampaignSettingsDto `json:"settings,omitempty"`
}

package models

// CampaignSettingsDeliveryDto - Информация о доставке в своем регионе магазина.
type CampaignSettingsDeliveryDto struct {

	Schedule CampaignSettingsScheduleDto `json:"schedule,omitempty"`
}

package models

// CampaignSettingsLocalRegionDto - Информация о своем регионе магазина.
type CampaignSettingsLocalRegionDto struct {

	// Идентификатор региона.
	Id int64 `json:"id,omitempty"`

	// Название региона.
	Name string `json:"name,omitempty"`

	Type RegionType `json:"type,omitempty"`

	DeliveryOptionsSource CampaignSettingsScheduleSourceType `json:"deliveryOptionsSource,omitempty"`

	Delivery CampaignSettingsDeliveryDto `json:"delivery,omitempty"`
}

package models

// GetCampaignsResponse - Результаты поиска магазинов.
type GetCampaignsResponse struct {

	// Список с информацией по каждому магазину.
	Campaigns []CampaignDto `json:"campaigns"`

	Pager FlippingPagerDto `json:"pager,omitempty"`
}

package models

// CampaignsQualityRatingDto - Информация об индексе качества магазинов.
type CampaignsQualityRatingDto struct {

	// Список магазинов c информацией об их индексе качества.
	CampaignRatings []CampaignQualityRatingDto `json:"campaignRatings"`
}

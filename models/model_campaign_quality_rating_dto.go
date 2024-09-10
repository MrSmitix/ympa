package models

// CampaignQualityRatingDto - Информация об индексе качества магазина.
type CampaignQualityRatingDto struct {

	// Идентификатор магазина.
	CampaignId int64 `json:"campaignId"`

	// Список значений индекса качества.
	Ratings []QualityRatingDto `json:"ratings"`
}

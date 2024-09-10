package models

// GetQualityRatingResponse - Информация об индексе качества магазинов.
type GetQualityRatingResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result CampaignsQualityRatingDto `json:"result,omitempty"`
}

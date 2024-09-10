package models

// GetFeedsResponse - Ответ на запрос списка прайс-листов.
type GetFeedsResponse struct {

	// Список прайс-листов.
	Feeds []FeedDto `json:"feeds"`
}

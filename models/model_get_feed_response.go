package models

// GetFeedResponse - Ответ на запрос информации о прайс-листе.
type GetFeedResponse struct {

	Feed FeedDto `json:"feed,omitempty"`
}

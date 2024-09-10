package models

// FeedIndexLogsOffersDto - Информация о предложениях прайс-листа.
type FeedIndexLogsOffersDto struct {

	// Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
	RejectedCount int64 `json:"rejectedCount,omitempty"`

	// Количество предложений в прайс-листе.
	TotalCount int64 `json:"totalCount,omitempty"`
}

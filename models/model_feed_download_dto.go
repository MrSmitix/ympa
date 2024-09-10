package models

// FeedDownloadDto - Информация о последней загрузке прайс-листа.
type FeedDownloadDto struct {

	Status FeedStatusType `json:"status,omitempty"`

	Error FeedDownloadErrorDto `json:"error,omitempty"`
}

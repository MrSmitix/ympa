package models

// FeedPublicationDto - Информация о последней публикации предложений из прайс-листа на Маркете.
type FeedPublicationDto struct {

	Status FeedStatusType `json:"status,omitempty"`

	Full FeedPublicationFullDto `json:"full,omitempty"`

	PriceAndStockUpdate FeedPublicationPriceAndStockUpdateDto `json:"priceAndStockUpdate,omitempty"`
}

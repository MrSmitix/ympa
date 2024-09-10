package models

// FeedContentDto - Информация о проверке содержимого прайс-листа, загруженного на Маркет.
type FeedContentDto struct {

	// Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. 
	RejectedOffersCount int64 `json:"rejectedOffersCount,omitempty"`

	Status FeedStatusType `json:"status,omitempty"`

	// Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. 
	TotalOffersCount int64 `json:"totalOffersCount,omitempty"`

	Error FeedContentErrorDto `json:"error,omitempty"`
}

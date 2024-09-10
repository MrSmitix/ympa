package models

// FeedPlacementDto - Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
type FeedPlacementDto struct {

	Status FeedStatusType `json:"status,omitempty"`

	// Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
	TotalOffersCount int32 `json:"totalOffersCount,omitempty"`
}

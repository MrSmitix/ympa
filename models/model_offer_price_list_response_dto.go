package models

// OfferPriceListResponseDto - Список цен на товары.
type OfferPriceListResponseDto struct {

	// Страница списка.
	Offers []OfferPriceResponseDto `json:"offers"`

	Paging ScrollingPagerDto `json:"paging,omitempty"`

	// Количество всех цен магазина, измененных через API.
	Total int32 `json:"total,omitempty"`
}

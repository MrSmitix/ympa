package models

// OfferPriceByOfferIdsListResponseDto - Список цен.
type OfferPriceByOfferIdsListResponseDto struct {

	// Страница списка цен.
	Offers []OfferPriceByOfferIdsResponseDto `json:"offers"`

	Paging ScrollingPagerDto `json:"paging,omitempty"`
}

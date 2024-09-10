package models

// GetBidsInfoResponseDto - Список товаров с указанными ставками.
type GetBidsInfoResponseDto struct {

	// Страница списка товаров.
	Bids []SkuBidItemDto `json:"bids"`

	Paging ForwardScrollingPagerDto `json:"paging,omitempty"`
}

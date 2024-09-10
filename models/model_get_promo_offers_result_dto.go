package models

// GetPromoOffersResultDto - Список товаров, которые участвуют или могут участвовать в акции.
type GetPromoOffersResultDto struct {

	// Товары, которые участвуют или могут участвовать в акции.
	Offers []GetPromoOfferDto `json:"offers"`

	Paging ForwardScrollingPagerDto `json:"paging,omitempty"`
}

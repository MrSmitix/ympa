package models

// GetOffersResponse - Список предложений с пагинатором.
type GetOffersResponse struct {

	// Список предложений магазина.
	Offers []OfferDto `json:"offers"`

	Pager FlippingPagerDto `json:"pager,omitempty"`
}

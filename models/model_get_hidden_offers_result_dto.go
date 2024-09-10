package models

// GetHiddenOffersResultDto - Список скрытых вами товаров. 
type GetHiddenOffersResultDto struct {

	Paging ScrollingPagerDto `json:"paging,omitempty"`

	// Список скрытых товаров.
	HiddenOffers []HiddenOfferDto `json:"hiddenOffers"`
}

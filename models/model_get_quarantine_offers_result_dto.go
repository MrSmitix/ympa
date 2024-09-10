package models

// GetQuarantineOffersResultDto - Список товаров в карантине.
type GetQuarantineOffersResultDto struct {

	Paging ScrollingPagerDto `json:"paging,omitempty"`

	// Страница списка товаров в карантине.
	Offers []QuarantineOfferDto `json:"offers"`
}

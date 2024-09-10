package models

// GetCampaignOffersResultDto - Список товаров в заданном магазине.
type GetCampaignOffersResultDto struct {

	Paging ScrollingPagerDto `json:"paging,omitempty"`

	// Страница списка товаров.
	Offers []GetCampaignOfferDto `json:"offers"`
}

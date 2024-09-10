package models

type GetSuggestedOfferMappingsRequest struct {

	// Список товаров.
	Offers *[]SuggestedOfferDto `json:"offers,omitempty"`
}

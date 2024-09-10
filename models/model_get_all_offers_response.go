package models

// GetAllOffersResponse - Список предложений.
type GetAllOffersResponse struct {

	// Список предложений магазина.
	Offers []OfferDto `json:"offers"`
}

package models

// OffersDto - Найденные предложения магазина.
type OffersDto struct {

	// Список предложений магазина.
	Offers []OfferDto `json:"offers"`
}

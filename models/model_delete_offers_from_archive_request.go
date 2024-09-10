package models

// DeleteOffersFromArchiveRequest - Товары, которые нужно восстановить из архива. 
type DeleteOffersFromArchiveRequest struct {

	// Список товаров, которые нужно восстановить из архива.
	OfferIds []string `json:"offerIds"`
}

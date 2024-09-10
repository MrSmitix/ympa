package models

// AddOffersToArchiveRequest - Товары, которые нужно поместить в архив. 
type AddOffersToArchiveRequest struct {

	// Список товаров, которые нужно поместить в архив.
	OfferIds []string `json:"offerIds"`
}

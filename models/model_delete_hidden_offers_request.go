package models

// DeleteHiddenOffersRequest - Запрос на возобновление показа оферов.
type DeleteHiddenOffersRequest struct {

	// Список скрытых товаров. 
	HiddenOffers []HiddenOfferDto `json:"hiddenOffers"`
}

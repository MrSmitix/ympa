package models

// AddHiddenOffersRequest - Запрос на скрытие оферов.
type AddHiddenOffersRequest struct {

	// Список скрытых товаров. 
	HiddenOffers []HiddenOfferDto `json:"hiddenOffers"`
}

package models

// SuggestPricesRequest - Запрос на получение списка цен для продвижения.
type SuggestPricesRequest struct {

	// Список товаров.
	Offers []SuggestOfferPriceDto `json:"offers"`
}

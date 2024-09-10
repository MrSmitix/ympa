package models

// UpdatePricesRequest - Запрос на установку цен на товары.
type UpdatePricesRequest struct {

	// Список товаров.
	Offers []OfferPriceDto `json:"offers"`
}

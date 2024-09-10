package models

// UpdateBusinessPricesRequest - Запрос на установку базовых цен на товары.
type UpdateBusinessPricesRequest struct {

	// Список товаров с ценами.
	Offers []UpdateBusinessOfferPriceDto `json:"offers"`
}

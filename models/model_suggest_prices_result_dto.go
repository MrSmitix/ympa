package models

// SuggestPricesResultDto - Результат запроса цен для продвижения.
type SuggestPricesResultDto struct {

	// Список товаров с ценами для продвижения.
	Offers []PriceSuggestOfferDto `json:"offers"`
}

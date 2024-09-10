package models

// DeleteOffersDto - Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.
type DeleteOffersDto struct {

	// Список SKU товаров, которые не удалось удалить.
	NotDeletedOfferIds *[]string `json:"notDeletedOfferIds,omitempty"`
}

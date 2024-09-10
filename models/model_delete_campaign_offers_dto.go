package models

// DeleteCampaignOffersDto - Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
type DeleteCampaignOffersDto struct {

	// Список SKU.
	NotDeletedOfferIds *[]string `json:"notDeletedOfferIds,omitempty"`
}

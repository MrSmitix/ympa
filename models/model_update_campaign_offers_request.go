package models

// UpdateCampaignOffersRequest - Запрос на обновление предложений товаров магазина.
type UpdateCampaignOffersRequest struct {

	// Параметры размещения товаров в заданном магазине.
	Offers []UpdateCampaignOfferDto `json:"offers"`
}

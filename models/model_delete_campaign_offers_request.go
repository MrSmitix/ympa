package models

// DeleteCampaignOffersRequest - Фильтрации удаляемых товаров по offerIds. 
type DeleteCampaignOffersRequest struct {

	// Идентификаторы товаров в каталоге.
	OfferIds []string `json:"offerIds"`
}

package models

// DeleteOffersRequest - Фильтрации удаляемых товаров по offerIds. 
type DeleteOffersRequest struct {

	// Список SKU товаров, которые нужно удалить.
	OfferIds []string `json:"offerIds"`
}

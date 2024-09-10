package models

// DeletePromoOffersResultDto - Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр `offerIds`. 
type DeletePromoOffersResultDto struct {

	// Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
	RejectedOffers *[]RejectedPromoOfferDeleteDto `json:"rejectedOffers,omitempty"`
}

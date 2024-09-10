package models

// UpdatePromoOffersResultDto - Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
type UpdatePromoOffersResultDto struct {

	// Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
	RejectedOffers *[]RejectedPromoOfferUpdateDto `json:"rejectedOffers,omitempty"`

	// Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
	WarningOffers *[]WarningPromoOfferUpdateDto `json:"warningOffers,omitempty"`
}

package models

// GetPromoOffersRequest - Получение списка товаров, которые участвуют или могут участвовать в акции.
type GetPromoOffersRequest struct {

	// Идентификатор акции.
	PromoId string `json:"promoId"`

	StatusType PromoOfferParticipationStatusFilterType `json:"statusType,omitempty"`
}

package models

// UpdateOfferContentRequest - Запрос на установку новых значений для параметров.
type UpdateOfferContentRequest struct {

	// Список товаров с указанными характеристиками.
	OffersContent []OfferContentDto `json:"offersContent"`
}

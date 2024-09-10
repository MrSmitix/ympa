package models

// DeletePromoOffersRequest - Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение `true` в параметре `deleteAllOffers`;  * часть товаров, передайте их идентификаторы в параметре `offersIds`. 
type DeletePromoOffersRequest struct {

	// Идентификатор акции.
	PromoId string `json:"promoId"`

	// Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`.
	DeleteAllOffers bool `json:"deleteAllOffers,omitempty"`

	// Товары, которые нужно убрать из акции.
	OfferIds *[]string `json:"offerIds,omitempty"`
}

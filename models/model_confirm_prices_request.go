package models

// ConfirmPricesRequest - Запрос на подтверждение цены. 
type ConfirmPricesRequest struct {

	// Идентификаторы товаров, у которых подтверждается цена.
	OfferIds []string `json:"offerIds"`
}

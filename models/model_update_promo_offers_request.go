package models

// UpdatePromoOffersRequest - Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`. 
type UpdatePromoOffersRequest struct {

	// Идентификатор акции.
	PromoId string `json:"promoId"`

	// Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
	Offers []UpdatePromoOfferDto `json:"offers"`
}

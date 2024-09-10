package models

// UpdatePromoOfferDiscountParamsDto - Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.  Обязательный параметр для акций с этими типами. 
type UpdatePromoOfferDiscountParamsDto struct {

	// Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым. 
	Price int64 `json:"price,omitempty"`

	// Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым. 
	PromoPrice int64 `json:"promoPrice,omitempty"`
}

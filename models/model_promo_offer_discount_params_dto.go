package models

// PromoOfferDiscountParamsDto - Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.
type PromoOfferDiscountParamsDto struct {

	// Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
	Price int64 `json:"price,omitempty"`

	// Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
	PromoPrice int64 `json:"promoPrice,omitempty"`

	// Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. 
	MaxPromoPrice int64 `json:"maxPromoPrice"`
}

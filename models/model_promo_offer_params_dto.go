package models

// PromoOfferParamsDto - Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
type PromoOfferParamsDto struct {

	DiscountParams PromoOfferDiscountParamsDto `json:"discountParams,omitempty"`

	PromocodeParams PromoOfferPromocodeParamsDto `json:"promocodeParams,omitempty"`
}

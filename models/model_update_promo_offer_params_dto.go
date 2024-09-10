package models

// UpdatePromoOfferParamsDto - Параметры товара, который участвует в акции.
type UpdatePromoOfferParamsDto struct {

	DiscountParams UpdatePromoOfferDiscountParamsDto `json:"discountParams,omitempty"`
}

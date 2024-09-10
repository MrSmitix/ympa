package models

// PromoOfferPromocodeParamsDto - Параметры товара в акции с типом `MARKET_PROMOCODE`.
type PromoOfferPromocodeParamsDto struct {

	// Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров. 
	MaxPrice int64 `json:"maxPrice"`
}

package models

// GetPromoPromocodeInfoDto - Информация для типа `MARKET_PROMOCODE`.  Параметр заполняется только для этого типа акции. 
type GetPromoPromocodeInfoDto struct {

	// Промокод.
	Promocode string `json:"promocode"`

	// Процент скидки по промокоду.
	Discount int32 `json:"discount"`
}

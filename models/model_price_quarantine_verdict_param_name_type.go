package models
// PriceQuarantineVerdictParamNameType : Имя параметра причины скрытия товара по цене.  * `CURRENT_PRICE` — цена, из-за которой товар попал в карантин. * `LAST_VALID_PRICE` — последняя цена до попадания в карантин (только для карантина типа `PRICE_CHANGE`). * `MIN_PRICE` — порог попадания в карантин (только для карантина типов `LOW_PRICE` и `LOW_PRICE_PROMO`). * `CURRENCY` — валюта. 
type PriceQuarantineVerdictParamNameType string

// List of PriceQuarantineVerdictParamNameType
const (
	CURRENT_PRICE PriceQuarantineVerdictParamNameType = "CURRENT_PRICE"
	LAST_VALID_PRICE PriceQuarantineVerdictParamNameType = "LAST_VALID_PRICE"
	MIN_PRICE PriceQuarantineVerdictParamNameType = "MIN_PRICE"
	CURRENCY PriceQuarantineVerdictParamNameType = "CURRENCY"
)

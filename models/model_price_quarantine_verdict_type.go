package models
// PriceQuarantineVerdictType : Типы карантина:  * `PRICE_CHANGE` — новая цена слишком сильно отличается от прежней. В поле `params` будет  новая цена `CURRENT_PRICE` и последняя цена до попадания в карантин `LAST_VALID_PRICE`. * `LOW_PRICE` — установленная цена слишком сильно отличается от рыночной. В поле `params` будет установленная вами цена `CURRENT_PRICE` и порог попадания в карантин `MIN_PRICE`. * `LOW_PRICE_PROMO` — цена после применения акций слишком сильно отличается от рыночной. В поле `params` будет цена после применения акций `CURRENT_PRICE` и порог попадания в карантин `MIN_PRICE`. 
type PriceQuarantineVerdictType string

// List of PriceQuarantineVerdictType
const (
	PRICE_CHANGE PriceQuarantineVerdictType = "PRICE_CHANGE"
	LOW_PRICE PriceQuarantineVerdictType = "LOW_PRICE"
	LOW_PRICE_PROMO PriceQuarantineVerdictType = "LOW_PRICE_PROMO"
)

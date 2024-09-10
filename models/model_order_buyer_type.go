package models
// OrderBuyerType : Тип покупателя:  * `PERSON` — физическое лицо.  * `BUSINESS` — организация. 
type OrderBuyerType string

// List of OrderBuyerType
const (
	PERSON OrderBuyerType = "PERSON"
	BUSINESS OrderBuyerType = "BUSINESS"
)

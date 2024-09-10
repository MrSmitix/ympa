package models
// OfferConditionQualityType : Внешний вид товара:  * `PERFECT` — идеальный. * `EXCELLENT` — отличный. * `GOOD` — хороший. * `NOT_SPECIFIED` — не выбран. 
type OfferConditionQualityType string

// List of OfferConditionQualityType
const (
	PERFECT OfferConditionQualityType = "PERFECT"
	EXCELLENT OfferConditionQualityType = "EXCELLENT"
	GOOD OfferConditionQualityType = "GOOD"
	NOT_SPECIFIED OfferConditionQualityType = "NOT_SPECIFIED"
)

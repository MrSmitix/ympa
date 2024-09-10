package models
// AffectedOrderQualityRatingComponentType : Составляющие индекса качества.  **Для модели DBS:** * `DBS_CANCELLATION_RATE` — доля отмененных товаров. * `DBS_LATE_DELIVERY_RATE` — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * `FBS_CANCELLATION_RATE` — доля отмененных товаров. * `FBS_LATE_SHIP_RATE` — доля не вовремя отгруженных заказов. 
type AffectedOrderQualityRatingComponentType string

// List of AffectedOrderQualityRatingComponentType
const (
	DBS_CANCELLATION_RATE AffectedOrderQualityRatingComponentType = "DBS_CANCELLATION_RATE"
	DBS_LATE_DELIVERY_RATE AffectedOrderQualityRatingComponentType = "DBS_LATE_DELIVERY_RATE"
	FBS_CANCELLATION_RATE AffectedOrderQualityRatingComponentType = "FBS_CANCELLATION_RATE"
	FBS_LATE_SHIP_RATE AffectedOrderQualityRatingComponentType = "FBS_LATE_SHIP_RATE"
)

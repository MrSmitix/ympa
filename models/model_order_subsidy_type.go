package models
// OrderSubsidyType : Тип субсидии:  * `YANDEX_CASHBACK` — скидка по подписке Яндекс Плюс.  * `SUBSIDY` — скидка Маркета (по акциям, промокодам, купонам и т. д.)  * `DELIVERY` — скидка за доставку (DBS). 
type OrderSubsidyType string

// List of OrderSubsidyType
const (
	YANDEX_CASHBACK OrderSubsidyType = "YANDEX_CASHBACK"
	SUBSIDY OrderSubsidyType = "SUBSIDY"
	DELIVERY OrderSubsidyType = "DELIVERY"
)

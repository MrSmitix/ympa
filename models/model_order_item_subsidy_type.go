package models
// OrderItemSubsidyType : Тип субсидии:  * `YANDEX_CASHBACK` — скидка по подписке Яндекс Плюс.  * `SUBSIDY` — скидка Маркета (по акциям, промокодам, купонам и т. д.). 
type OrderItemSubsidyType string

// List of OrderItemSubsidyType
const (
	YANDEX_CASHBACK OrderItemSubsidyType = "YANDEX_CASHBACK"
	SUBSIDY OrderItemSubsidyType = "SUBSIDY"
)

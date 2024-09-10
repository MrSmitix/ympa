package models
// OutletType : Тип точки продаж.  Возможные значения:  * `DEPOT` — пункт выдачи заказов. * `MIXED` — смешанный тип точки продаж (торговый зал и пункт выдачи заказов). * `RETAIL` — розничная точка продаж (торговый зал). 
type OutletType string

// List of OutletType
const (
	DEPOT OutletType = "DEPOT"
	MIXED OutletType = "MIXED"
	RETAIL OutletType = "RETAIL"
	NOT_DEFINED OutletType = "NOT_DEFINED"
)

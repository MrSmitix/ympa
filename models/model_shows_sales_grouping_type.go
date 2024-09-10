package models
// ShowsSalesGroupingType : Группировка данных отчета. Возможные значения: * `CATEGORIES` — группировка по категориям. * `OFFERS` — группировка по товарам. 
type ShowsSalesGroupingType string

// List of ShowsSalesGroupingType
const (
	CATEGORIES ShowsSalesGroupingType = "CATEGORIES"
	OFFERS ShowsSalesGroupingType = "OFFERS"
)

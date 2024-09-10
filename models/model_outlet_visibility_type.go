package models
// OutletVisibilityType : Состояние точки продаж.  Возможные значения:  * `HIDDEN` — точка продаж выключена. * `VISIBLE` — точка продаж включена. 
type OutletVisibilityType string

// List of OutletVisibilityType
const (
	HIDDEN OutletVisibilityType = "HIDDEN"
	VISIBLE OutletVisibilityType = "VISIBLE"
	UNKNOWN OutletVisibilityType = "UNKNOWN"
)

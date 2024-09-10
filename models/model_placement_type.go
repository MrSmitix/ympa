package models
// PlacementType : Модель, по которой работает магазин:  * `FBS` — FBS или Экспресс. * `FBY` — FBY. * `DBS` — DBS. 
type PlacementType string

// List of PlacementType
const (
	FBS PlacementType = "FBS"
	FBY PlacementType = "FBY"
	DBS PlacementType = "DBS"
)

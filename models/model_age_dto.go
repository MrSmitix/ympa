package models

// AgeDto - Возраст в заданных единицах измерения.
type AgeDto struct {

	// Значение. 
	Value float32 `json:"value"`

	AgeUnit AgeUnitType `json:"ageUnit"`
}

package models

// QualityRatingComponentDto - Составляющая индекса качества.
type QualityRatingComponentDto struct {

	// Значение составляющей в процентах.
	Value float64 `json:"value"`

	ComponentType QualityRatingComponentType `json:"componentType"`
}

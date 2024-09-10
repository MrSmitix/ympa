package models

// ParameterValueConstraintsDto - Ограничения на значения характеристик.
type ParameterValueConstraintsDto struct {

	// Минимальное число.
	MinValue float64 `json:"minValue,omitempty"`

	// Максимальное число.
	MaxValue float64 `json:"maxValue,omitempty"`

	// Максимальная длина текста.
	MaxLength int32 `json:"maxLength,omitempty"`
}

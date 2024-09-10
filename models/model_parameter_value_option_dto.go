package models

// ParameterValueOptionDto - Значение характеристики.
type ParameterValueOptionDto struct {

	// Идентификатор значения.
	Id int64 `json:"id"`

	// Значение.
	Value string `json:"value"`

	// Описание значения.
	Description string `json:"description,omitempty"`
}

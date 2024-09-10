package models

// UnitDto - Единица измерения.
type UnitDto struct {

	// Идентификатор единицы измерения.
	Id int64 `json:"id"`

	// Сокращенное название единицы измерения.
	Name string `json:"name"`

	// Полное название единицы измерения.
	FullName string `json:"fullName"`
}

package models

// CategoryParameterUnitDto - Единицы измерения характеристики товара.
type CategoryParameterUnitDto struct {

	// Единица измерения по умолчанию.
	DefaultUnitId int64 `json:"defaultUnitId"`

	// Допустимые единицы измерения.
	Units []UnitDto `json:"units"`
}

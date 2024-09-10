package models

// OptionValuesLimitedDto - Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
type OptionValuesLimitedDto struct {

	// Идентификатор значения ограничивающей характеристики.
	LimitingOptionValueId int64 `json:"limitingOptionValueId"`

	// Идентификаторы допустимых значений ограничиваемой характеристики. 
	OptionValueIds []int64 `json:"optionValueIds"`
}

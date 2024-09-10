package models

// CategoryParameterDto - Характеристика товара.
type CategoryParameterDto struct {

	// Идентификатор характеристики.
	Id int64 `json:"id"`

	// Название характеристики.
	Name string `json:"name,omitempty"`

	Type ParameterType `json:"type"`

	Unit CategoryParameterUnitDto `json:"unit,omitempty"`

	// Описание характеристики.
	Description string `json:"description,omitempty"`

	// Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
	RecommendationTypes *[]OfferCardRecommendationType `json:"recommendationTypes,omitempty"`

	// Обязательность характеристики.
	Required bool `json:"required"`

	// Используется ли характеристика в фильтре.
	Filtering bool `json:"filtering"`

	// Является ли характеристика особенностью варианта.
	Distinctive bool `json:"distinctive"`

	// Можно ли передать сразу несколько значений.
	Multivalue bool `json:"multivalue"`

	// Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.
	AllowCustomValues bool `json:"allowCustomValues"`

	// Список допустимых значений параметра. Только для характеристик типа `ENUM`.
	Values *[]ParameterValueOptionDto `json:"values,omitempty"`

	Constraints ParameterValueConstraintsDto `json:"constraints,omitempty"`

	// Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.
	ValueRestrictions *[]ValueRestrictionDto `json:"valueRestrictions,omitempty"`
}

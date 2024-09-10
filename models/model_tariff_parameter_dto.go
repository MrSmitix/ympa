package models

// TariffParameterDto - Детали расчета конкретной услуги Маркета.
type TariffParameterDto struct {

	// Название параметра.
	Name string `json:"name"`

	// Значение параметра.
	Value string `json:"value"`
}

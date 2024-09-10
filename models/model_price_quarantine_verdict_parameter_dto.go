package models

// PriceQuarantineVerdictParameterDto - Параметр карантина.
type PriceQuarantineVerdictParameterDto struct {

	Name PriceQuarantineVerdictParamNameType `json:"name"`

	// Значение параметра.
	Value string `json:"value"`
}

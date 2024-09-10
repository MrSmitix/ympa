package models

// PriceQuarantineVerdictDto - Причина попадания товара в карантин.
type PriceQuarantineVerdictDto struct {

	Type PriceQuarantineVerdictType `json:"type,omitempty"`

	// Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.
	Params []PriceQuarantineVerdictParameterDto `json:"params"`
}

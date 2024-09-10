package models

// CalculatedTariffDto - Информация об услугах Маркета.
type CalculatedTariffDto struct {

	Type CalculatedTariffType `json:"type"`

	// Стоимость услуги в рублях.
	Amount float32 `json:"amount,omitempty"`

	// Параметры расчета тарифа.
	Parameters []TariffParameterDto `json:"parameters"`
}

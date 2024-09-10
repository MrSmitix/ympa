package models

// TariffDto - Информация о тарифах, по которым нужно заплатить за услуги Маркета.
type TariffDto struct {

	Type TariffType `json:"type"`

	// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
	// Deprecated
	Percent float32 `json:"percent,omitempty"`

	// Значение тарифа в рублях.
	Amount float32 `json:"amount"`

	// Параметры расчета тарифа.
	Parameters []TariffParameterDto `json:"parameters"`
}

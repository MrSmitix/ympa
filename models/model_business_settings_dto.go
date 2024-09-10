package models

// BusinessSettingsDto - Настройки кабинета.
type BusinessSettingsDto struct {

	// Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену. 
	OnlyDefaultPrice bool `json:"onlyDefaultPrice,omitempty"`

	Currency CurrencyType `json:"currency,omitempty"`
}

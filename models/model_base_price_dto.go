package models

// BasePriceDto - Цена на товар.
type BasePriceDto struct {

	// Значение.
	Value float32 `json:"value"`

	CurrencyId CurrencyType `json:"currencyId"`
}

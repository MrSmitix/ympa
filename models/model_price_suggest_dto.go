package models

// PriceSuggestDto - Тип цены.
type PriceSuggestDto struct {

	Type PriceSuggestType `json:"type,omitempty"`

	// Цена в рублях.
	Price float32 `json:"price,omitempty"`
}

package models

import (
	"time"
)

// GetPriceDto - Цена с указанием времени последнего обновления.
type GetPriceDto struct {

	// Значение.
	Value float32 `json:"value"`

	CurrencyId CurrencyType `json:"currencyId"`

	// Время последнего обновления.
	UpdatedAt time.Time `json:"updatedAt"`
}

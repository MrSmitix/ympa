package models

import (
	"time"
)

// OfferPriceResponseDto - Информация об установленной цене на товар.
type OfferPriceResponseDto struct {

	// Идентификатор предложения из прайс-листа.
	Id string `json:"id,omitempty"`

	Price PriceDto `json:"price,omitempty"`

	// SKU на Маркете.
	MarketSku int64 `json:"marketSku,omitempty"`

	// Дата и время последнего обновления цены на товар.
	UpdatedAt time.Time `json:"updatedAt,omitempty"`
}

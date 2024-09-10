package models

// OrderBoxLayoutPartialCountDto - Информация о части товара в коробке.
type OrderBoxLayoutPartialCountDto struct {

	// Номер части, начиная с 1.
	Current int32 `json:"current"`

	// На сколько всего частей разделен товар.
	Total int32 `json:"total"`
}

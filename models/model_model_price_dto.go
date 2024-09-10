package models

// ModelPriceDto - Информация о ценах на модель товара.
type ModelPriceDto struct {

	// Средняя цена предложения для модели в регионе.
	Avg float32 `json:"avg,omitempty"`

	// Максимальная цена предложения для модели в регионе.
	Max float32 `json:"max,omitempty"`

	// Минимальная цена предложения для модели в регионе.
	Min float32 `json:"min,omitempty"`
}

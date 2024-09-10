package models

// ModelDto - Модель товара.
type ModelDto struct {

	// Идентификатор модели товара.
	Id int64 `json:"id,omitempty"`

	// Название модели товара.
	Name string `json:"name,omitempty"`

	Prices ModelPriceDto `json:"prices,omitempty"`
}

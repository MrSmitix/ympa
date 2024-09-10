package models

// MaxSaleQuantumDto - Лимит на установку кванта и минимального количества товаров по категориям. 
type MaxSaleQuantumDto struct {

	// Идентификатор категории.
	Id int64 `json:"id"`

	// Название категории.
	Name string `json:"name,omitempty"`

	// Лимит на установку кванта и минимального количества товаров.
	MaxSaleQuantum int32 `json:"maxSaleQuantum,omitempty"`
}

package models

// GetCategoriesMaxSaleQuantumDto - Категории и лимит на установку кванта и минимального количества товаров.
type GetCategoriesMaxSaleQuantumDto struct {

	// Категории и лимит на установку кванта и минимального количества товаров.
	Results []MaxSaleQuantumDto `json:"results"`

	// Ошибки, которые появились из-за переданных категорий.
	Errors *[]CategoryErrorDto `json:"errors,omitempty"`
}

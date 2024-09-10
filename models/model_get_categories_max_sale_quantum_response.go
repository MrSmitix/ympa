package models

type GetCategoriesMaxSaleQuantumResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	// Категории и лимит на установку кванта и минимального количества товаров.
	Results []MaxSaleQuantumDto `json:"results"`

	// Ошибки, которые появились из-за переданных категорий.
	Errors *[]CategoryErrorDto `json:"errors,omitempty"`
}

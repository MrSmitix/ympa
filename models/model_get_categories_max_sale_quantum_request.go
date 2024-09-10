package models

// GetCategoriesMaxSaleQuantumRequest - Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
type GetCategoriesMaxSaleQuantumRequest struct {

	// Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.
	MarketCategoryIds []int64 `json:"marketCategoryIds"`
}

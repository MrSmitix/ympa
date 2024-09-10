package models

// OrdersStatsPriceDto - Цена или скидки на товар.
type OrdersStatsPriceDto struct {

	Type OrdersStatsPriceType `json:"type,omitempty"`

	// Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. 
	CostPerItem float32 `json:"costPerItem,omitempty"`

	// Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. 
	Total float32 `json:"total,omitempty"`
}

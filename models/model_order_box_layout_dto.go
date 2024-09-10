package models

// OrderBoxLayoutDto - Информация о коробке.
type OrderBoxLayoutDto struct {

	// Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
	Items []OrderBoxLayoutItemDto `json:"items"`
}

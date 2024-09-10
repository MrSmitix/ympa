package models

// OrderItemsModificationResultDto - Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ `OK`. 
type OrderItemsModificationResultDto struct {

	// Список позиций в заказе, подлежащих маркировке.
	Items []BriefOrderItemDto `json:"items"`
}

package models

// OrderItemDetailDto - Детали по товару в заказе.
type OrderItemDetailDto struct {

	// Количество единиц товара.
	ItemCount int64 `json:"itemCount,omitempty"`

	ItemStatus OrderItemStatusType `json:"itemStatus,omitempty"`

	// Формат даты: `ДД-ММ-ГГГГ`. 
	UpdateDate string `json:"updateDate,omitempty"`
}

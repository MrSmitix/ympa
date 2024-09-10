package models

// OrdersStatsDetailsDto - Информация об удалении товара из заказа.
type OrdersStatsDetailsDto struct {

	ItemStatus OrdersStatsItemStatusType `json:"itemStatus,omitempty"`

	// Количество товара со статусом, указанном в параметре `itemStatus`.
	ItemCount int64 `json:"itemCount,omitempty"`

	// Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. 
	UpdateDate string `json:"updateDate,omitempty"`

	StockType OrdersStatsStockType `json:"stockType,omitempty"`
}

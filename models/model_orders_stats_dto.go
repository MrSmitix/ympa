package models

// OrdersStatsDto - Информация по заказам.
type OrdersStatsDto struct {

	// Список заказов.
	Orders []OrdersStatsOrderDto `json:"orders"`

	Paging ForwardScrollingPagerDto `json:"paging,omitempty"`
}

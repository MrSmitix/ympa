package models

// GetOrdersResponse - Модель для ответа API списка информации по заказам.
type GetOrdersResponse struct {

	Pager FlippingPagerDto `json:"pager,omitempty"`

	// Модель заказа. 
	Orders []OrderDto `json:"orders"`

	Paging ForwardScrollingPagerDto `json:"paging,omitempty"`
}

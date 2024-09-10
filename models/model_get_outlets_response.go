package models

// GetOutletsResponse - Ответ на запрос информации о точках продаж.
type GetOutletsResponse struct {

	// Информация о точках продаж.
	Outlets []FullOutletDto `json:"outlets"`

	Paging ScrollingPagerDto `json:"paging,omitempty"`

	Pager FlippingPagerDto `json:"pager,omitempty"`
}

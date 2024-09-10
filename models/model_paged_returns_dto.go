package models

// PagedReturnsDto - Возвраты.
type PagedReturnsDto struct {

	Paging ForwardScrollingPagerDto `json:"paging,omitempty"`

	// Список возвратов.
	Returns []ReturnDto `json:"returns"`
}

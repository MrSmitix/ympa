package models

type GetRegionsResponse struct {

	// Регион доставки.
	Regions []RegionDto `json:"regions"`

	Paging ForwardScrollingPagerDto `json:"paging,omitempty"`
}

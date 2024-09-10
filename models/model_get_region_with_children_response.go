package models

type GetRegionWithChildrenResponse struct {

	Pager FlippingPagerDto `json:"pager,omitempty"`

	Regions RegionDto `json:"regions,omitempty"`
}

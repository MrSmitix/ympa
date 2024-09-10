package models

type GetWarehouseStocksResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result GetWarehouseStocksDto `json:"result,omitempty"`
}

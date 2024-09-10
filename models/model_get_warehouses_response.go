package models

type GetWarehousesResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result WarehousesDto `json:"result,omitempty"`
}

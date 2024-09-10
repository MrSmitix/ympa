package models

type GetFulfillmentWarehousesResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result FulfillmentWarehousesDto `json:"result,omitempty"`
}

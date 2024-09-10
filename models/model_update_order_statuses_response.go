package models

type UpdateOrderStatusesResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result UpdateOrderStatusesDto `json:"result,omitempty"`
}

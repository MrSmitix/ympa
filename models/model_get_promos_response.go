package models

type GetPromosResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result GetPromosResultDto `json:"result,omitempty"`
}

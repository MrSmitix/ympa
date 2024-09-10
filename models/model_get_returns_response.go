package models

type GetReturnsResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result PagedReturnsDto `json:"result,omitempty"`
}

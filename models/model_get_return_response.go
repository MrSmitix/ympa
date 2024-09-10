package models

type GetReturnResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result ReturnDto `json:"result,omitempty"`
}

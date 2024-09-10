package models

type SetOrderBoxLayoutResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result OrderBoxesLayoutDto `json:"result,omitempty"`
}

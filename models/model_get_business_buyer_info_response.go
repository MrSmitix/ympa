package models

type GetBusinessBuyerInfoResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result OrderBusinessBuyerDto `json:"result,omitempty"`
}

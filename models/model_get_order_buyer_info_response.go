package models

type GetOrderBuyerInfoResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result OrderBuyerInfoDto `json:"result,omitempty"`
}

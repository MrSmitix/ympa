package models

type GetShipmentOrdersInfoResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result OrdersShipmentInfoDto `json:"result,omitempty"`
}

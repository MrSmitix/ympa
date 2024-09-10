package models

type GetShipmentResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result ShipmentDto `json:"result,omitempty"`
}

package models

type SetOrderShipmentBoxesResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result ShipmentBoxesDto `json:"result,omitempty"`
}

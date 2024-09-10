package models

type SetOrderDeliveryDateRequest struct {

	Dates OrderDeliveryDateDto `json:"dates"`

	Reason OrderDeliveryDateReasonType `json:"reason"`
}

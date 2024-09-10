package models

type ProvideOrderItemIdentifiersResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result OrderItemsModificationResultDto `json:"result,omitempty"`
}

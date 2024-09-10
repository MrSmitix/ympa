package models

type GetOfferMappingsResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result GetOfferMappingsResultDto `json:"result,omitempty"`
}

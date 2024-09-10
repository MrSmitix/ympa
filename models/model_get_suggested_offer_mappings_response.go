package models

type GetSuggestedOfferMappingsResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result GetSuggestedOfferMappingsResultDto `json:"result,omitempty"`
}

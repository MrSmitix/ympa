package models

type GetOfferRecommendationsResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result OfferRecommendationsResultDto `json:"result,omitempty"`
}

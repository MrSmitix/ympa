package models

// GetBidsRecommendationsResponse - description.
type GetBidsRecommendationsResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result GetBidsRecommendationsResponseDto `json:"result,omitempty"`
}

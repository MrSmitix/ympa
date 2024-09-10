package models

type GetQualityRatingDetailsResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result QualityRatingDetailsDto `json:"result,omitempty"`
}

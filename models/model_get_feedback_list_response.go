package models

type GetFeedbackListResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result FeedbackListDto `json:"result,omitempty"`
}

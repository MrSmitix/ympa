package models

type UpdateGoodsFeedbackCommentResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result GoodsFeedbackCommentDto `json:"result,omitempty"`
}

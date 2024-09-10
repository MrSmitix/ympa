package models

type GetGoodsFeedbackCommentsResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result GoodsFeedbackCommentListDto `json:"result,omitempty"`
}

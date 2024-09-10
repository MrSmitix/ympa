package models

type GetGoodsFeedbackResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result GoodsFeedbackListDto `json:"result,omitempty"`
}

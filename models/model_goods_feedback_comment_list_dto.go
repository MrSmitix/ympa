package models

// GoodsFeedbackCommentListDto - Комментарии к отзыву.
type GoodsFeedbackCommentListDto struct {

	// Список комментариев.
	Comments []GoodsFeedbackCommentDto `json:"comments"`

	Paging ForwardScrollingPagerDto `json:"paging,omitempty"`
}

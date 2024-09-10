package models

// GoodsFeedbackListDto - Список отзывов о товарах. 
type GoodsFeedbackListDto struct {

	// Список отзывов.
	Feedbacks []GoodsFeedbackDto `json:"feedbacks"`

	Paging ForwardScrollingPagerDto `json:"paging,omitempty"`
}

package models

// FeedbackListDto - Отзывы пользователей Яндекс Маркета об указанном магазине.
type FeedbackListDto struct {

	Paging ScrollingPagerDto `json:"paging,omitempty"`

	// Список отзывов.  Содержит не более 20 отзывов. 
	FeedbackList []FeedbackDto `json:"feedbackList"`
}

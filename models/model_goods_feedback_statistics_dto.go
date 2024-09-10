package models

// GoodsFeedbackStatisticsDto - Статистическая информация по отзыву.
type GoodsFeedbackStatisticsDto struct {

	// Оценка товара.
	Rating int32 `json:"rating"`

	// Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. 
	CommentsCount int64 `json:"commentsCount"`

	// Рекомендуют ли этот товар.
	Recommended bool `json:"recommended,omitempty"`

	// Количество баллов Плюса, которое автор получил за отзыв.
	PaidAmount int64 `json:"paidAmount,omitempty"`
}

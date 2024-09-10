package models

import (
	"time"
)

// GoodsFeedbackDto - Отзыв о товаре.
type GoodsFeedbackDto struct {

	// Идентификатор отзыва. 
	FeedbackId int64 `json:"feedbackId"`

	// Дата и время создания отзыва.
	CreatedAt time.Time `json:"createdAt"`

	// Нужен ли ответ на отзыв.
	NeedReaction bool `json:"needReaction"`

	Identifiers GoodsFeedbackIdentifiersDto `json:"identifiers"`

	// Имя автора отзыва.
	Author string `json:"author,omitempty"`

	Description GoodsFeedbackDescriptionDto `json:"description,omitempty"`

	Media GoodsFeedbackMediaDto `json:"media,omitempty"`

	Statistics GoodsFeedbackStatisticsDto `json:"statistics"`
}

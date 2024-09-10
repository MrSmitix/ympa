package models

import (
	"time"
)

// FeedbackCommentDto - Комментарий к отзыву на магазин.
type FeedbackCommentDto struct {

	// Идентификатор ответа.
	Id int64 `json:"id,omitempty"`

	// Идентификатор родительского ответа.
	ParentId int64 `json:"parentId,omitempty"`

	// Текст ответа.
	Body string `json:"body,omitempty"`

	// Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
	CreatedAt time.Time `json:"createdAt,omitempty"`

	// Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
	UpdatedAt time.Time `json:"updatedAt,omitempty"`

	Author FeedbackCommentAuthorDto `json:"author,omitempty"`

	// Дочерние ответы.
	Children *[]FeedbackCommentDto `json:"children,omitempty"`
}

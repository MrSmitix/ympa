package models

import (
	"time"
)

// FeedbackDto - Отзыв пользователя Яндекс Маркета об указанном магазине.
type FeedbackDto struct {

	// Идентификатор отзыва.
	Id int64 `json:"id,omitempty"`

	// Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
	CreatedAt time.Time `json:"createdAt,omitempty"`

	// Комментарий автора отзыва.
	Text string `json:"text,omitempty"`

	State FeedbackStateType `json:"state,omitempty"`

	Author FeedbackAuthorDto `json:"author,omitempty"`

	// Достоинства магазина, описанные в отзыве.
	Pro string `json:"pro,omitempty"`

	// Недостатки магазина, описанные в отзыве.
	Contra string `json:"contra,omitempty"`

	// Переписка автора отзыва с магазином.
	Comments []FeedbackCommentDto `json:"comments"`

	Shop FeedbackShopDto `json:"shop,omitempty"`

	// Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
	Resolved bool `json:"resolved,omitempty"`

	// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. 
	Verified bool `json:"verified,omitempty"`

	// Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. 
	Recommend bool `json:"recommend,omitempty"`

	Grades FeedbackGradesDto `json:"grades,omitempty"`

	Order FeedbackOrderDto `json:"order,omitempty"`
}

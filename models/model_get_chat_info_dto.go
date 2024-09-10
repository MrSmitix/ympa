package models

import (
	"time"
)

// GetChatInfoDto - Информация о чатах.
type GetChatInfoDto struct {

	// Идентификатор чата.
	ChatId int64 `json:"chatId"`

	// Идентификатор заказа.
	OrderId int64 `json:"orderId"`

	Type ChatType `json:"type"`

	Status ChatStatusType `json:"status"`

	// Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
	CreatedAt time.Time `json:"createdAt"`

	// Дата и время последнего сообщения в чате.
	UpdatedAt time.Time `json:"updatedAt"`
}

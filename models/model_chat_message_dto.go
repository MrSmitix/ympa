package models

import (
	"time"
)

// ChatMessageDto - Информация о сообщениях.
type ChatMessageDto struct {

	// Идентификатор сообщения.
	MessageId int64 `json:"messageId"`

	// Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
	CreatedAt time.Time `json:"createdAt"`

	Sender ChatMessageSenderType `json:"sender"`

	// Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. 
	Message string `json:"message,omitempty"`

	// Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. 
	Payload *[]ChatMessagePayloadDto `json:"payload,omitempty"`
}

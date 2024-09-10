package models

import (
	"time"
)

// FeedPublicationFullDto - Информация о последней публикации предложений из прайс-листа на Маркете. 
type FeedPublicationFullDto struct {

	// Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	FileTime time.Time `json:"fileTime,omitempty"`

	// Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	PublishedTime time.Time `json:"publishedTime,omitempty"`
}

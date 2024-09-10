package models

import (
	"time"
)

// FeedIndexLogsRecordDto - Список отчетов по индексации прайс-листа.
type FeedIndexLogsRecordDto struct {

	// Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	DownloadTime time.Time `json:"downloadTime,omitempty"`

	// Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	FileTime time.Time `json:"fileTime,omitempty"`

	// Идентификатор индексации.
	GenerationId int64 `json:"generationId,omitempty"`

	IndexType FeedIndexLogsIndexType `json:"indexType,omitempty"`

	// Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	PublishedTime time.Time `json:"publishedTime,omitempty"`

	Status FeedIndexLogsStatusType `json:"status,omitempty"`

	Error FeedIndexLogsErrorDto `json:"error,omitempty"`

	Offers FeedIndexLogsOffersDto `json:"offers,omitempty"`
}

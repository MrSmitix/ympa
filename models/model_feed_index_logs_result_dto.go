package models

// FeedIndexLogsResultDto - Результат выполнения запроса отчета по индексации прайс-листа.
type FeedIndexLogsResultDto struct {

	Feed FeedIndexLogsFeedDto `json:"feed,omitempty"`

	// Список отчетов по индексации прайс-листа.
	IndexLogRecords []FeedIndexLogsRecordDto `json:"indexLogRecords"`

	// Количество отчетов на всех страницах выходных данных.
	Total int64 `json:"total,omitempty"`
}

package models

// FeedContentErrorDto - Информация об ошибке в содержимом прайс-листа. Выводится, если параметр `content status=ERROR`. 
type FeedContentErrorDto struct {

	Type FeedContentErrorType `json:"type,omitempty"`
}

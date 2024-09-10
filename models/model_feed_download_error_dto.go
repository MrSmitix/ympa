package models

// FeedDownloadErrorDto - Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. 
type FeedDownloadErrorDto struct {

	// HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
	HttpStatusCode int32 `json:"httpStatusCode,omitempty"`

	Type FeedDownloadErrorType `json:"type,omitempty"`

	// Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`. 
	Description string `json:"description,omitempty"`
}

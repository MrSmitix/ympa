package models

// FeedIndexLogsErrorDto - Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (`index-log-record status=ERROR`). 
type FeedIndexLogsErrorDto struct {

	// HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
	HttpStatusCode int32 `json:"httpStatusCode,omitempty"`

	Type FeedIndexLogsErrorType `json:"type,omitempty"`

	// Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`. 
	Description string `json:"description,omitempty"`
}

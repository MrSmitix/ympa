package models
// FeedIndexLogsStatusType : Статус индексации прайс-листа и проверки на соответствие техническим требованиям.  Возможные значения:  * `ERROR` — произошли ошибки. * `OK` — обработан без ошибок. * `WARNING` — наблюдались некритичные проблемы. 
type FeedIndexLogsStatusType string

// List of FeedIndexLogsStatusType
const (
	ERROR FeedIndexLogsStatusType = "ERROR"
	OK FeedIndexLogsStatusType = "OK"
	WARNING FeedIndexLogsStatusType = "WARNING"
)

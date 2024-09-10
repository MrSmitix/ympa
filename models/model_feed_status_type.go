package models
// FeedStatusType : Статус прайс-листа.  Возможные значения:    * `ERROR` — найдены ошибки.   * `NA` — прайс-лист не загружался более семи дней или на этапе загрузки произошла ошибка.   * `OK` — ошибок не найдено. 
type FeedStatusType string

// List of FeedStatusType
const (
	ERROR FeedStatusType = "ERROR"
	NA FeedStatusType = "NA"
	OK FeedStatusType = "OK"
)

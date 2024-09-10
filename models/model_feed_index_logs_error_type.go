package models
// FeedIndexLogsErrorType : Тип ошибки индексации прайс-листа.  Возможные значения:  * `DOWNLOAD_ERROR` — ошибка загрузки прайс-листа. Например, проблема с DNS-сервером или обрыв интернет-соединения.    Проблема описана в параметре `description`.  * `DOWNLOAD_HTTP_ERROR` — Маркет передал запрос на получение прайс-листа и получил в ответ HTTP-код, отличный от 2xx.    HTTP-код выведен в параметре `httpStatusCode`.  * `PARSE_ERROR` — ошибка при проверке прайс-листа, не связанная с форматом YML. Например, прайс-лист пустой или его не удалось разархивировать.  * `PARSE_XML_ERROR` — несоответствие техническим требованиям формата YML. Например, элементы и их значения описаны некорректно.  * `TOO_MANY_REJECTED_OFFERS` — более чем в половине предложений из прайс-листа найдены ошибки. Все предложения из прайс-листа не будут опубликованы на Маркете. 
type FeedIndexLogsErrorType string

// List of FeedIndexLogsErrorType
const (
	DOWNLOAD_ERROR FeedIndexLogsErrorType = "DOWNLOAD_ERROR"
	DOWNLOAD_HTTP_ERROR FeedIndexLogsErrorType = "DOWNLOAD_HTTP_ERROR"
	PARSE_ERROR FeedIndexLogsErrorType = "PARSE_ERROR"
	PARSE_XML_ERROR FeedIndexLogsErrorType = "PARSE_XML_ERROR"
	TOO_MANY_REJECTED_OFFERS FeedIndexLogsErrorType = "TOO_MANY_REJECTED_OFFERS"
	NOT_INDEXED FeedIndexLogsErrorType = "NOT_INDEXED"
)

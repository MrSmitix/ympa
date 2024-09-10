package models
// FeedDownloadErrorType : Тип ошибки загрузки прайс-листа.  Возможные значения:  * `DOWNLOAD_ERROR` — ошибка загрузки прайс-листа. Например, проблема с DNS-сервером или обрыв интернет-соединения.   Проблема описана в параметре `description`.  * `DOWNLOAD_HTTP_ERROR` — Яндекс Маркет передал запрос на получение прайс-листа и получил в ответ HTTP-код, отличный от 2xx.  HTTP-код выведен в параметре `httpStatusCode`. 
type FeedDownloadErrorType string

// List of FeedDownloadErrorType
const (
	ERROR FeedDownloadErrorType = "DOWNLOAD_ERROR"
	HTTP_ERROR FeedDownloadErrorType = "DOWNLOAD_HTTP_ERROR"
)

package models
// FeedIndexLogsIndexType : Тип обновления.  Возможные значения:  * `DIFF` — частичное обновление данных на Яндекс Маркете (например, обновление цен ранее опубликованных предложений и публикация новых). * `FAST_PRICE` — только обновление цен ранее опубликованных предложений. * `FULL` — полное обновление данных на Яндекс Маркете. 
type FeedIndexLogsIndexType string

// List of FeedIndexLogsIndexType
const (
	DIFF FeedIndexLogsIndexType = "DIFF"
	FAST_PRICE FeedIndexLogsIndexType = "FAST_PRICE"
	FULL FeedIndexLogsIndexType = "FULL"
)

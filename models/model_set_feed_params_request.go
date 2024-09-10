package models

// SetFeedParamsRequest - Запрос на обновление изменение параметров прайс-листа.
type SetFeedParamsRequest struct {

	// Параметры прайс-листа.  Обязательный параметр. 
	Parameters []FeedParameterDto `json:"parameters"`
}

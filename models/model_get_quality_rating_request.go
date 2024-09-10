package models

// GetQualityRatingRequest - Запрос информации по индексу качества.
type GetQualityRatingRequest struct {

	// Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты. 
	DateFrom string `json:"dateFrom,omitempty"`

	// Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты. 
	DateTo string `json:"dateTo,omitempty"`

	// Список идентификаторов магазинов.
	CampaignIds []int64 `json:"campaignIds"`
}

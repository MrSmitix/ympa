package models

// GenerateGoodsTurnoverRequest - Данные, необходимые для генерации отчета. 
type GenerateGoodsTurnoverRequest struct {

	// Идентификатор кампании.
	CampaignId int64 `json:"campaignId"`

	// Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.
	Date string `json:"date,omitempty"`
}

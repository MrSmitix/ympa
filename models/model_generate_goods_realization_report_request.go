package models

// GenerateGoodsRealizationReportRequest - Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
type GenerateGoodsRealizationReportRequest struct {

	// Идентификатор кампании.
	CampaignId int64 `json:"campaignId"`

	// Год.
	Year int32 `json:"year"`

	// Номер месяца.
	Month int32 `json:"month"`
}
